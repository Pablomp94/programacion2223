## Estructuras de selección

Entre los diferentes tipos de estructuras de control que permiten establecer el flujo de control de un programa, las más fáciles de entender son aquellas que crean bifurcaciones o caminos alternativos, de forma que, según las circunstancias, se ejecute un conjunto de instrucciones u otro. De esta forma, dadas diferentes ejecuciones de un mismo código fuente, parte de las instrucciones que se ejecutan pueden ser diferentes para cada caso.

Las estructuras de selección permiten tomar decisiones sobre qué conjunto de instrucciones se deben ejecutar en un punto del programa. O sea, seleccionar qué código se ejecuta en un momento determinado entre caminos alternativos.

Toda estructura de selección se basa en la evaluación de una expresión que debe dar un resultado booleano: true (cierto) o false (falso). Esta expresión se llama la condición lógica de la estructura.

El conjunto de instrucciones que se ejecutará dependerá del resultado de la condición lógica, actuando como una especie de interruptor que marca el flujo a seguir dentro del programa. Normalmente, esta condición lógica se basa en parte, o en su totalidad, en valores almacenados en variables cuyo valor puede ser diferente para diferentes ejecuciones del programa. De lo contrario, no tiene sentido utilizar una estructura de selección, ya que mientras se está escribiendo el programa ya se puede predecir cuál será el resultado de la expresión. Por tanto, como siempre será lo mismo, siempre se ejecutarán las mismas instrucciones sin que haya bifurcación posible.

Existen distintos modelos de flujos alternativos a la hora de ejecutar instrucciones, aunque para todos se usa la misma familia de sentencias y una estructura similar en el código fuente. Por tanto, todos los aspectos destacados para uno de los modelos se aplican también a todos los demás. También cabe decir que, si bien los ejemplos y la sintaxis descrita en este módulo se centran en el lenguaje Java, la mayoría de las estructuras de selección descritas son compartidas con los otros lenguajes de programación, por lo que el concepto general es más aplicable allá del Java. Sólo tendrá que buscar en la documentación la sintaxis específica para el lenguaje elegido.

### SENTENCIA IF (Selección Simple)
El caso más simple dentro de las estructuras de selección es aquel en el que existe un conjunto o bloque de instrucciones que sólo desea que se ejecuten bajo unas circunstancias concretas. De lo contrario, este blog es ignorado y, desde el punto de vista de la ejecución del programa, es como si no existiera. Un ejemplo sería el programa de una tienda virtual que aplica un descuento al precio final de acuerdo con cierto criterio (por ejemplo, si la compra total es como mínimo de 100€). En este caso, existe un conjunto de instrucciones, las que aplican el descuento, que sólo se ejecutan cuando se cumple la condición. De lo contrario, se ignoran y el precio final es el mismo que el original.

>La estructura de selección simple permite controlar que se ejecute un conjunto de instrucciones si y sólo si se cumple la condición lógica (es decir, el resultado de evaluar la condición lógica es igual a true). De lo contrario, no se ejecutan.

#### Sintaxis y comportamiento
Para llevar a cabo este tipo de control sobre las instrucciones del programa, es necesario usar una sentencia if (si…). En el caso de Java, la sintaxis es la siguiente:
```java
instrucciones del programa
if (expresión booleana) {
  Instrucciones para ejecutar si la expresión evalúa a true (cierto) - Bloque if
}
resto de instrucciones del programa
````

Si entre los paréntesis se pone una expresión que no evalúa un resultado de tipo booleano, habrá un error de compilación. Por ejemplo, un error típico es el siguiente:

```java
if (numero=5) {
		//Esto devuelve un error, pues un '=' equivale a una asignación, y no a una comparación,
		//y una asignación no devuelve un valor booleano
}
````

Este bloque de código puede no ser ejecutado si la sentencia no se cumple

###  SENTENCIA IF - ELSE
A menudo necesitamos realizar dos process completamente distintos, dependiendo de SI cumple o no la/s condición/es de entrada del IF.
Ejemplo: 
- Si hace frio, ponte el abrigo; en caso contrario, ven en camisa.
- Si te toca la primitiva, vete de fiesta; si no, vuelve a jugar otra vez.

En cualquiera de los dos ejemplos anteriores, se hará algo siempre, pero dependerá del valor de la condición.

En el lenguaje Java, la sintaxis es la siguiente:
```java
if (expresión booleana) {
   Instrucciones para ejecutar si la expresión la evalúa en true (cierto) - Bloque if
} else {
   Instrucciones alternativas para ejecutar si la expresión la evalúa a false (falso) - Blog else
}
````

El bloque `if` tiene exactamente las mismas características que cuando se usa en una estructura de selección simple. Éstas se cumplen también para el caso del bloque else, con la particularidad de que no tiene ninguna expresión asignada. Simplemente, cuando la condición lógica de la sentencia if no se cumple se ejecutan las instrucciones del blog else. La figura 4 muestra el diagrama del flujo de control a escala genérica.

**EJEMPLO**
Introducir un número por teclado. Que nos diga si es positivo o negativo.
**ESTUDIO PREVIO**
Para saber si el número es positivo o negativo. es necesaria la utilización del IF-ELSE: un número es positivo o es. negativo, pero nunca puede ser las dos cosas al mismo tiempo.
Al número 0 lo consideramos como positivo.
**VARIABLE**
num = almacena el número introducido por teclado.
**PSEUDOCÓDIGO**
```code
Algoritmo positivo_negativo
	Leer numero;
	Si (numero>=0)
		Escribir "Es un número positivo";
	SiNo
		Escribir "Es un número negativo";
	FinSi
FinAlgoritmo
````


### VARIOS CAMINOS: SENTENCIA ''if/else if/else''

Finalmente, a la hora de establecer el flujo de control de un programa, también existe la posibilidad de que haya un número arbitrario de caminos alternativos, no sólo dos. Por ejemplo, imagináis un programa que, a partir de la nota numérica de un examen, debe establecer cuál es la calificación del alumno. Por eso habrá que ver dentro de qué rango se encuentra el número. En cualquier caso, los posibles resultados son más de dos.

La estructura de selección múltiple permite controlar el hecho de que al cumplirse un caso entre un conjunto finito de casos se ejecute el correspondiente conjunto de instrucciones.

Este tipo de control sobre las instrucciones del programa tiene asociada la sentencia if/else if/else (en su caso, en este otro caso, en su defecto). Básicamente, se trata de la misma estructura que la sentencia if/else, pero con un número arbitrario de bloques if (después del primer bloque, llamados else if). En el caso de Java, la sintaxis es la siguiente:

```code
instrucciones del programa
if (expresión booleana 1) {
   Instrucciones para ejecutar si la expresión 1 la evalúa a true (cierto) - Bloque if
} else if (expresión booleana 2) {
   Instrucciones para ejecutar si la expresión 2 la evalúa a true (cierto) - Bloque else if
} else if (expresión booleana 3) {
   Instrucciones para ejecutar si la expresión 3 la evalúa a true (cierto) - Bloque else if
 
...se repite cuantas veces sea necesario...
 
} else if (expresión booleana N) {
   Instrucciones para ejecutar si la expresión N evalúa a true (cierto) - Bloque else if
} else {
   Instrucciones alternativas si todas las expresiones 1...N evalúan a false (falso) - Bloque else
}
resto de instrucciones del programa
````

Lo importante de esta sentencia es que sólo se ejecutará un único blog de todos los posibles. Incluso en caso de que más de una de las expresiones booleanas pueda evaluar a cierto, sólo se ejecutará el bloque asociado a la primera de estas expresiones dentro del orden establecido en la sentencia.

También es destacable el hecho de que el blog else es opcional. Si no queremos, no es necesario ponerlo. En este caso, si no se cumple ninguna de las condiciones, no se ejecuta instrucción alguna entre las incluidas dentro de la sentencia.

#### Ejemplo: transformar evaluación numérica a texto
La forma de usar la sentencia if/else if/lese puede verse mejor mediante el código del ejemplo propuesto anteriormente. Una vez más, antes de ver el código se repasarán los pasos que debe realizar el programa para llevar a cabo su objetivo y el orden a seguir.

- Pedir que se introduzca la nota por el teclado.
- Leerla.
- Mostrar un texto u otro según el rango de valores dentro del cual se encuentra la nota:
- Si es mayor o igual que 9 y menor o igual que 10, la nota es de “Excelente”.
- Si es mayor e igual que 6,5 pero estrictamente menor que 9, la nota es "Notable".
- Si es mayor e igual que 5 pero estrictamente menor que 6,5, la nota es “Suficiente”.
- Si no es ninguno de los casos anteriores, la nota es de “Suspendido”.

Esta vez es el paso 3 el que presenta diferentes posibilidades según cumplan ciertas condiciones. En este caso, sin embargo, hay más de un camino (hay cuatro). Además, es necesario decidir si se cumple una condición diferente para decidir cuál es el camino que hay que seguir entre todas las opciones. El último se realiza simplemente cuando no se cumple ninguno de los anteriores. Por tanto, se trata de una selección múltiple.

> No hay que olvidar que en una estructura de selección la condición lógica siempre va entre paréntesis.

Un hecho destacado en esta descripción de las tareas que debe llevar a cabo el programa, como mínimo respecto a los ejemplos anteriores, es que para cada paso posible deben cumplirse dos condiciones a la vez. El valor de la nota debe estar por debajo de cierto valor y por encima de otro. La expresión de tipo booleano a evaluar para ver qué camino hay que seguir debe comprobar ambas cosas: que se cumple una cosa y otra. O sea, es necesaria una expresión lógica basada en la conjunción de dos comparaciones. Una vez más, observe qué instrucciones se corresponden a cada uno de los pasos descritos. Fíjese en particular en cómo son las condiciones lógicas para cada caso.

El código en JAVA podría ser el siguiente:
```java
/* 
 * Programa que muestra la calificación en base a una nota.
 * 5-11-2022
 * Joaquin Rios
 */
import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué nota has sacado? ");
        float nota = sc.nextFloat();
        sc.close();
        // Estructura de selección múltiple.
        // Se entra en el bloque donde la condición lógica evalúe a true.
        // Si ninguno lo hace, se entra en el blog else.
        System.out.print("Tu nota final es ");
        if ((nota >= 9) && (nota <= 10)) {
            System.out.println("Sobresaliente.");
        } else if ((nota >= 6.5) && (nota < 9)) {
            System.out.println("Notable.");
        } else if ((nota >= 5) && (nota < 6.5)) {
            System.out.println("Aprobado.");
        } else {
            System.out.println("Suspenso.");
        }

    }
}
```
