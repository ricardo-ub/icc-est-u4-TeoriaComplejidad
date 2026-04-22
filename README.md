# ¿Qué es la complejidad?
Es el estudio encargado de analizar el comportamiento de los algoritmos según los recursos necesarios para su ejecución. Se enfoca en estimar cuánto tiempo tardará un programa y cuánta memoria consumirá antes de ser ejecutado.
# Eficiencia de algoritmos
La eficiencia se evalúa en el análisis de algoritmos y busca optimizár el programa considerando los costes computacionales en función de la entrada de datos.
## Coste Temporal
Implica el tiempo requerido para ejecutar un programa, el cual se estima mediante un análisis de las operaciones que son realizadas, como cálculos o asignaciones.
## Coste Espacial
Implica la cantidad me memoria adicional o auxiliar que un algoritmo requiere en su funcionamiento. Este consumo depende directamente del tamaño de la entrada de datos, así como de las estructuras del propio algoritmo.
# ¿Qué son los factores en tiempo de ejecución?
Son los elementos que influyen en la rapidez con la que se ejecuta un algoritmo y se dividen en dos categorias según su origen.
## Factores Propios
Son características própias del algoritmo, como el número de operaciones, la estructura de control o la organización de datos. Los cuales son afectados por el tamaño de la entrada de datos, que a su vez, definen la complejidad del programa.
## Factores Circunstanciales
Los factores circunstaciales hacen referencia al entorno, como el hardware, sistema operativo, lenguaje de programación usado y el copilador. Aunque influyen en el tiempo de ejecución, no modifican la complejidad del algoritmo.
# Formas de analizar un código
Existen dos enfoques principales y se relacionan directamente con los factores en tiempo de ejecución.
## Análisis teórico
Evalúa el algoritmo sin ejecutarlo, se centra únicamente en los factores propios y en como crece los costes según la entrada de datos. Proporcionando una evaluación general que no depende de un entorno.
## Análisis experimental
Consiste en ejecutar el codigo primero y medir su rendimiento real, considerando factores propios y cirscunstanciales. Sus resultados son más limitados que un análisis teórico ya que depende de la máquina donde se ejecuta la prueba del algoritmo.
# Notación Big O
Es una forma de representar mediante las matemáticas, de cómo dependiendo del tamaño de la entrada, el tiempo de ejecución de un algoritmo crece. Sirve para comparar la eficiencia de los algoritmos.

Peor caso (Big O): Representa el máximo de operaciones que puede requerir un algoritmo. 
Mejor caso (Big Ω): Representa el escenario ideal, es decir el menor número de intentos o menor número de operaciones posibles. 

Caso promedio (Big Θ): es el comportamiento esperado en la mayoría de las ejecuciones, considerando entradas de datos comunes. 
## Big O, Ω, Θ
Big O (O): es el límite superior, conocido como: el peor caso.

Big Ω (Ω): es el límite inferior, conocido como: el mejor caso.

Big Θ (Θ): comportamiento promedio o ajustado: ocurre cuando el algoritmo se comporta de igual manera en el peor y en el mejor de los casos.
## Notaciones de Big O

O(n): significa que el número de operaciones que realiza crece de manera proporcional al tamaño de la entrada, es decir si un arreglo tiene 10 posiciones, el algoritmo realizará hasta 10 comparaciones hasta hallar el dato buscado en el peor de los casos.

O(log n): La complejidad logarítmica significa que el número de pasos crece lentamente aunque la entrada aumente en gran medida, en este caso el algoritmo divide los datos en 2 y los analiza dependiendo del valor descartando la mitad de valores en cada análisis.

O(n log n): mezcla la función de las divisiones logarítmicas (O(log n)) y el trabajo lineal (O(n)), y funciona de manera que al dividir los datos empieza a analizar todos los datos restantes y así hasta encontrar el valor deseado. Esto permite una mayor precisión a la hora de encontrar valores.

O(n²): en el análisis de datos por complejidad cuadrática en tiempo, cada vez que se duplica la cantidad de datos el tiempo de ejecución se multiplica siendo una cantidad proporcional. Este tipo de análisis sirve muy bien para listas pequeñas ya que con listas muy grandes se complica la búsqueda.

O(2ⁿ): La complejidad exponencial en tiempo significa que cada vez que se introduzcan datos nuevos, el tiempo de ejecución se duplica. Este caso solo sirve para problemas pequeños o cuando no existe otra manera más eficiente.

O(n!): La complejidad factorial en tiempo funciona de tal manera que permite generar todas las posibles permutaciones u órdenes de un conjunto de datos.