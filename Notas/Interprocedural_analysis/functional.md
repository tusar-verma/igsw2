## functional

Se modela el contexto como los posibles estados que puede tomar las variables.

Ejemplo: Los 2 llamados a la función definen el contexto. En este caso con los valores 0 y + (para sign analysis) el resto unreachable

![](<ejemplo_1.png>){width=50%}

### Call node y function node

![](<restriccion_call_node_functional.png>){width=50%}![](<call_node_info_context.png>){width=50%}

En palabras $S_w^{c'}$ es el estado formado a partir de los datos del nodo $w$ en el contexto $c'$. 

Dependiendo la elección del contexto, $c'$ puede ser un call string (si k=1 seria simplemente un call node) o en el caso funcinal sería un estado que define valores de las variables de entrada de la función a la que pertenece el nodo $w$. 

Si con dicho contexto $c'$, $w$ no es alcanzable entonces $[w](c') = unreachable$

### After call node

![](<after_call_functional.png>){width=60%}

Del mismo modo que en call string, el resultado se define en el mismo contexto del call node $[v](c) = [v'](c)[...]$ y usando el resultado de la función a partir de dicho contexto del call node (del estado formado por el contexto del call node en este caso): $[w](S_w^{c'})(result)$