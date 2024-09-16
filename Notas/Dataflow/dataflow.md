---
geometry: margin=2cm
output: pdf_document
---

## Live variable analysis

En cada punto del programa ver qué variables están vivas: si hay un "camino" que la utiliza sin redefinirla.
Es un analisis backward (usa info de los sucesores para inferir propiedades del nodo) y may (ante información que se pisa, redondea para arriba en el reticulado)

![](lv_definition.png)

![](ej_lv.png)


## Available expresions

Ver por cada punto de programa qué expresiones ya estan computadas y no fueron modificadas. Se computa las expresiones dadas por todos los caminos hacia ese punto del programa

Por lo tanto es un analisis forward must, toma la información de las expresiones de los predecesores de un nodo (punto de un programa) y calcula las expresiones disponibles

![](ae_definition.png)
![](ae_definition2.png)

## Very busy expresions

Es un analisis backward must. Busca las expresiones que van a ser utilizadas nuevamente antes de redefinirlas en dicho punto de programa.

![](vb_def.png){width=60%}

En el siguiente programa la expresion $a*b$ es very busy en el loop
![](vb_example.png){width=20%}

## Reaching definitions

El conjunto de definiciones que pueden llegar a un punto de un programa. Se define como un par < variable, nodo en el que se definió >. Es un analisis forward may.

![](rd_def.png)

![](rd_practica.png)