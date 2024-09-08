Se modela el contexto como los posibles estados que puede tomar las variables.

Ejemplo: Los 2 llamados a la función definen el contexto. En este caso con los valores 0 y + (para sign analysis) el resto unreachable

![](<ejemplo_1.png>)

## Call node y function node

![](<restriccion_call_node_functional.png>)

![](<call_node_info_context.png>)

En palabras $S_w^{c'}$ es el estado formado a partir de los datos del nodo $w$ en el contexto $c'$. 

Dependiendo la elección del contexto, $c'$ puede ser un call string (si k=1 seria simplemente un call node) o en el caso funcinal sería un estado que define valores de las variables de entrada de la función a la que pertenece el nodo $w$. 

Si con dicho contexto $c'$, $w$ no es alcanzable entonces $\llbracket w \rrbracket (c') = unreachable$

## After call node

![](<after_call_functional.png>)

Del mismo modo que en call string, el resultado se define en el mismo contexto del call node $$\llbracket v \rrbracket(c) = \llbracket v' \rrbracket(c)[...]$ y usando el resultado de la función a partir de dicho contexto del call node (del estado formado por el contexto del call node en este caso): $\llbracket w \rrbracket(S_w^{c'})(result)$