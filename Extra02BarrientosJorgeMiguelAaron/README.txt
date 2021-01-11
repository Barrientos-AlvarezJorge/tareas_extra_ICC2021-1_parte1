Jorge Miguel Aaron Barrientos Alvarez
jma.barriemtos@ciencias.unam.mx
Numero de cuenta:421111666

***Pregunta del punto 3: ¿Por qué usaste alguna de esas tres formas
para romper el cilo?

*En mi caso usé la función del 'continue' para romper el ciclo while.
Pensé en hacer un método que mostrara los números impares que hay
entre el 1 y el 50. La estructura del while del método era sencilla:
primero se aumentaba en uno el contador que iba desde 1 hasta 50;
luego se evaluaba el contador con valor i para ver si i era un
número par, de ser así se usaba la función del 'continue'; después
se imprimia el número i.

*Preferí usar 'continue' ya que, por ejemplo, si hubiese usado 'break'
el método hubiese impreso únicamente el número 1, ya que al
encontrarse al número 2 hubiera roto el while por completo. En
cambio, el 'continue' evitaba que se imprimiera i si i era par y
luego volvía al inicio del While, lo que aseguraba que sólo se
imprimirían números impares.


***Explica la función de 'continue', 'break' y 'return' y muestra
un ejemplo.

**Función de 'continue': 'continue' nos permite omitir las líneas
de código que se encuentren debajo de él (dentro del controlador
de flujo) para ir directamente a volver a evaluar la condición del
controlador de flujo para que, en caso de ser verdadera,se comience
a realizar la nueva iteración.

*Ejemplo: si queremos eleminar las vocales de una cadena String
podemos ir analizando caracter por caracter, en caso de ser una
vocal usar la función del 'continue' y al final guardar los
caracteres en una nueva cadena String. Como el 'continue' se
encuentra antes de que se guarden los caracteres en la nueva cadena,
esto asegura que en la nueva cadena solo habrá caracteres que no
sean vocales.

**Función de 'break': 'break' nos permite romper por completo
un controlador de flujo aunque la condición de éste se siga
cumpliendo.

*Ejemplo: supongamos que hay una cadena String con al menos una
letra 'a'. Si queremos encontrar la posición de la primera letra 'a'
de la cadena String, lo que podemos hacer es ir analizando
caracter por caracter para que, en caso de encontrar una letra 'a',
usar la función del 'break'. Después de usarla el controlador
de flujo se rompe por completo y ya no analizará más los caracteres
de la cadena String.

**Función de 'return': 'return' nos permite devolver algún valor
de algun tipo que queramos.

*Ejemplo: retomando el ejemplo anterior, supongamos que analizamos
a la cadena String con un for. Si se encuentra la vocal 'a' y se hace
el 'break', podemos usar la función 'return' para devolver el valor
del contador i en el que se quedó el for; esto nos dirá la posición
de la primera letra 'a' que se encuentra en la cadena String.
