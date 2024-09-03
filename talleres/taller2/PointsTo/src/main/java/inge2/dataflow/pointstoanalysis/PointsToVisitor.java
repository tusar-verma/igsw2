package inge2.dataflow.pointstoanalysis;

import soot.jimple.*;
import soot.jimple.internal.JInstanceFieldRef;
import soot.jimple.internal.JimpleLocal;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PointsToVisitor extends AbstractStmtSwitch<Void> {

    private final PointsToGraph pointsToGraph;

    public PointsToVisitor(PointsToGraph pointsToGraph) {
        this.pointsToGraph = pointsToGraph;
    }

    @Override
    public void caseAssignStmt(AssignStmt stmt) {
        boolean isLeftLocal = stmt.getLeftOp() instanceof JimpleLocal;
        boolean isRightLocal = stmt.getRightOp() instanceof JimpleLocal;

        boolean isLeftField = stmt.getLeftOp() instanceof JInstanceFieldRef;
        boolean isRightField = stmt.getRightOp() instanceof JInstanceFieldRef;

        boolean isRightNew = stmt.getRightOp() instanceof AnyNewExpr;

        if (isRightNew) { // x = new A()
            processNewObject(stmt);
        } else if (isLeftLocal && isRightLocal) { // x = y
            processCopy(stmt);
        } else if (isLeftField && isRightLocal) { // x.f = y
            processStore(stmt);
        } else if (isLeftLocal && isRightField) { // x = y.f
            processLoad(stmt);
        }
    }

    private void processNewObject(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        Node nodeName = pointsToGraph.getNodeName(stmt);

        // Implementamos la operacion de creación de objeto que consiste en
        // la variable leftVariableName tenga asignado el nuevo nodo
        pointsToGraph.setNodesForVariable(leftVariableName, Collections.singleton(nodeName));
    }

    private void processCopy(AssignStmt stmt) {
        String leftVariableName = stmt.getLeftOp().toString();
        String rightVariableName = stmt.getRightOp().toString();

        // Implementacion de x = y
        // x apuntará a todos los nodos apuntados por y
        pointsToGraph.setNodesForVariable(leftVariableName, pointsToGraph.getNodesForVariable(rightVariableName));
    }

    private void processStore(AssignStmt stmt) { // x.f = y

        JInstanceFieldRef leftFieldRef = (JInstanceFieldRef) stmt.getLeftOp();
        String leftVariableName = leftFieldRef.getBase().toString();
        String fieldName = leftFieldRef.getField().getName();
        String rightVariableName = stmt.getRightOp().toString();
        // Tomo todos los nodos apuntados por X
        Set<Node> leftVariableNodes = pointsToGraph.getNodesForVariable(leftVariableName);
        // Tomo todos los nodos apuntados por Y
        Set<Node> rightVariableNodes = pointsToGraph.getNodesForVariable(rightVariableName);
        // todos los nodos de X que tengan field f apuntaran a todos los nodos apuntados por y
        for (Node l : leftVariableNodes) {
            for (Node r : rightVariableNodes) {
                pointsToGraph.addEdge(l, fieldName, r);
            }
        }
    }

    private void processLoad(AssignStmt stmt) { // x = y.f
        String leftVariableName = stmt.getLeftOp().toString();
        JInstanceFieldRef rightFieldRef = (JInstanceFieldRef) stmt.getRightOp();
        String rightVariableName = rightFieldRef.getBase().toString();
        String fieldName = rightFieldRef.getField().getName();

        // Armo un set de todos los nodos alcanzables desde Y por el field f y se los asigno X
        Set<Node> leftVarRes = new HashSet<>();
        for(Node n : pointsToGraph.getNodesForVariable(rightVariableName)){
            leftVarRes.addAll(pointsToGraph.getReachableNodesByField(n, fieldName));
        }
        pointsToGraph.setNodesForVariable(leftVariableName,leftVarRes);
    }
}
