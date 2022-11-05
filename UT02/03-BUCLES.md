
## Estructuras de repetición
 
Hasta el momento, todos los programas que ha estudiado, ya fueran más complejos o más sencillos, tenían una característica en común. Su flujo de control avanzaba inexorablemente hacia la instrucción final del método principal sin posibilidad de retroceder. Sea cual sea el camino alternativo por el que se ha llegado, una vez una instrucción ha sido ejecutada, ya no se volverá a ejecutar nunca más. Este hecho contrasta con el comportamiento que se puede observar en muchas actividades que hacemos a diario, como por ejemplo, cuando ponemos sal en la comida que cocinamos. Podemos repetir varias veces el proceso de poner sal y probarlo hasta que el gusto sea el que queremos (y entonces ya dejamos de poner sal y probar). 

Esto también ocurre en programas de su ordenador, en los que se pueden repetir acciones sin problemas: abrir y guardar diferentes archivos, conectarse a diferentes páginas web, etc. Aquí es donde entra en juego el siguiente tipo de estructura de control, también muy importante dentro del código de un programa.

> Las estructuras de repetición o iterativas permiten repetir una misma secuencia de instrucciones varias veces, mientras se cumpla cierta condición.

En su aspecto general, tienen muy parecido a una estructura de selección. Hay una sentencia especial que hay que escribir en el código fuente, unida a una condición lógica y un bloque de código (en este caso, siempre será sólo uno). Pero en ese caso, mientras la condición lógica sea cierta, toda la secuencia de instrucciones se va ejecutando repetidamente. En el momento en que se deja de cumplir la condición, se deja de ejecutar el bloque de código y ya se sigue con la instrucción que existe después de la sentencia de la estructura de repetición.

> Llamamos **bucle** o ciclo al conjunto de instrucciones que se debe repetir un cierto número de veces, y llamamos **iteración** a cada ejecución individual del bucle.

Como ocurre con las estructuras de selección, hay diferentes tipos de sentencias, cada una con sus particularidades. Normalmente, la diferencia principal está vinculada al momento en que se evalúa la condición para ver si es necesario volver a repetir el bloque de instrucciones o no. 

### Control de las estructuras repetitivas

Como ocurría con las estructuras de selección, las estructuras de repetición no tienen sentido a menos que la condición lógica depende de alguna variable que pueda ver modificado su valor para diferentes ejecuciones. De lo contrario, la condición siempre valdrá lo mismo para cualquier ejecución posible y utilizar una estructura de control no será muy útil. En este caso, si la condición siempre es false, nunca se ejecuta el bucle, por lo que es código inútil. Sin embargo, para las estructuras de repetición, si la condición siempre es true el problema es mucho más grave. Como absolutamente siempre que se evalúa si es necesario realizar una nueva iteración, la condición se cumple, el bucle no se deja nunca de repetir. ¡El programa nunca acabará!

> **¡CUIDADO!** Un bucle infinito es una secuencia de instrucciones dentro de un programa que se repite indefinidamente, normalmente porque se espera que se alcance una condición que nunca llega a producirse. ¡¡¡¡ HAY QUE LLEVAR MUCHO CUIDADO CON ESTO !!!!

Cuando esto sucede, el programa no se puede detener de otra forma que no sea cerrándolo directamente desde el sistema operativo (por ejemplo, cerrando la ventana asociada o con alguna secuencia especial de escape del teclado) o usando algún mecanismo de control de la ejecución de su programa que ofrezca el IDE usado.

Teniendo en cuenta el peligro de que un programa se acabe ejecutando indefinidamente, forzosamente dentro de todo bucle deben existir instrucciones que manipulen variables cuyo valor permita controlar la repetición o el final del bucle. Estas variables se llaman variables de control.

Garantizar la correcta asignación de valores de las variables de control de una estructura repetitiva es extremadamente importante. Cuando genera un programa, es imprescindible que el código permita que, en algún momento, la variable cambie de valor, de forma que la condición lógica se deje de cumplir. Si esto no es así, tendrá un bucle infinito.

Normalmente, las variables de control dentro de un bucle se pueden englobar dentro de alguno de estos tipos de comportamiento:
- **Contador**: una variable de tipo entero que va aumentando o disminuyendo, indicando de forma clara el número de iteraciones a realizar.
- **Acumulador**: una variable en la que se van acumulando directamente los cálculos que se quieren realizar, por lo que al alcanzar cierto valor se considera que ya no es necesario realizar más iteraciones. Si bien se parecen a los contadores, no son exactamente lo mismo.
- **Semáforo**: una variable que sirve como interruptor explícito de si es necesario seguir haciendo iteraciones. Cuando ya no queremos hacer más, el código simplemente se encarga de asignarle el valor específico que servirá para que la condición evalúe false.
Los semáforos también se llaman popularmente flags (banderolas de aviso).

Evidentemente, una condición lógica puede tomar la forma de una expresión muy compleja, pero para empezar es suficiente con conocer estos tres modelos. En ocasiones, las diferencias pueden ser sutiles, por lo que tampoco hay que preocuparse demasiado si no se tiene claro a qué tipo pertenece exactamente la variable de control. Igualmente, tener presentes estos tres papeles básicos puede ser de ayuda de cara a enfocar la programación de una estructura de selección.

### 1. Repetir si se cumple una condición: la sentencia ''while''

La estructura de repetición por antonomasia es la codificada mediante la sentencia while. Ésta existe de una forma u otra en la mayoría de lenguajes de programación. Su particularidad es que prácticamente cualquier código basado en una estructura de repetición puede representarse usando esta sentencia. Con esta ya tendría suficiente para tratar casi cualquier caso posible. Esto sucede con contraposición de las estructuras de selección, en las que cada tipo de sentencia ofrece distintas posibilidades.

La sentencia while permite repetir la ejecución del bucle mientras se verifique la condición lógica. Esta condición se verifica al principio de cada iteración. Si la primera vez, justo cuando se ejecuta la sentencia por primera vez, ya no se cumple, no se ejecuta iteración alguna.

**Sintaxis y estructura**
Para realizar este tipo de control sobre las iteraciones de un bucle, la sintaxis de esta sentencia en el lenguaje Java es la siguiente:

```java
while (expresión booleana) {
  Instrucciones para ejecutar dentro del bucle
}
````

Como puede ver, su formato es muy parecido a la sentencia if, simplemente cambiando la palabra clave por while. Como ya ocurría con las diferentes sentencias dentro de las estructuras de selección, si entre los paréntesis se pone una expresión que no evalúa un resultado de tipo booleano, habrá un error de compilación.

Ejemplo: ahorrarse de escribir lo mismo muchas veces
La utilidad más directa de una estructura de repetición es que, en caso de que desee ejecutar exactamente las mismas instrucciones muchas veces, no las tenga que escribir un montón de golpes. Por ejemplo, suponga que desea escribir una línea horizontal en la pantalla exactamente con cuarenta caracteres ‘-’. Evidentemente, nada le impide pulsar exactamente 40 veces la tecla, ni una más ni una menos, y ya está. Pero, ¿también lo haría si es necesario escribir cien, mil o incluso más? Hacerlo con una estructura de repetición es más cómodo.

Para alcanzar este objetivo, es necesario que el bucle itere un cierto número de veces. Para ello, necesitará una variable de control de tipo contador, que sirva para contar cuántas iteraciones hay hechas. O sea, cada vez que se produce una iteración, sumar 1. Una vez que esta variable supera el valor que queremos, ya no es necesario realizar más iteraciones. Por tanto, la condición lógica debe controlar si el valor de la variable es inferior al número de iteraciones a realizar.

Un posible código que ilustra esto sería lo siguiente. Compílelo y ejecútelo para ver qué hace:

```java
//Un programa que escribe una línea con 100 caracteres '-'.
public class Linea {
  public static void main (String[] args) {
    //Inicializamos un contador
    int i = 0;
    //¿Ya hemos hecho esto 100 veces?
    while (i < 100) {
      System.out.print('-');
      //Lo hemos hecho una vez, sumamos 1 al contador
      i = i + 1;
    }
    //Forzamos un salto de línea
    System.out.println();
  }
}
````

Hay un par de cuestiones del código anterior que vale la pena comentar. Por un lado, la nomenclatura de la variable de control de tipo contador. Evidentemente, se puede usar el identificador que se desee, pero es común usar letras individuales (i, j, k…) para poder identificar rápidamente qué variable dentro de un bucle es un contador y facilitar su comprensión. Por otra parte, a la hora de usar contadores, suele empezarse desde el valor 0 en lugar de 1.

Para ver con más detalle qué está pasando en un bucle usaremos una tabla. Cada fila corresponderá a una iteración y en cada columna se especificará el valor de las diferentes variables dentro del bucle, de modo que se puede ver cómo evolucionan en cada iteración. Normalmente, se hace énfasis en el valor al inicio del bucle, justo antes de evaluar la condición lógica, y al final del bucle, justo después de la última instrucción, para ver cuáles han sido las modificaciones al ejecutar las instrucciones contenidas. Evidentemente, los valores de las variables al inicio de una iteración deben ser exactamente los mismos que justo al inicio de la siguiente.

La tabla 1 muestra un resumen de cómo cambia el valor de la variable de control y de cuál es el resultado de evaluar la condición lógica en cada iteración para el ejemplo actual.

Tabla Evolución del bucle para escribir 100 caracteres:
|   Iteración   | ‘i’ vale | Condición vale | ‘i’ vale |
| :--: | :--:| :--: | :--: |
|  1   | 0 | (0 < 100), true | 1
|  2   | 1 | (1 < 100), true | 2
|  3   | 2 | (2 < 100), true | 3
| … |
| 99   | 98 | (98 < 100), true | 99
| 100  | 99 | (99 < 100), true | 100
| 101  |100 | (100 < 100), false | Ya hemos salido del bucle

La utilidad de las estructuras de selección va mucho más allá de ser una forma sencilla de ahorrarse escribir el mismo código muchas veces. Con éstas se pueden ejecutar instrucciones de formas que no se pueden replicar simplemente haciendo muchas veces “copiar” y “pegar” dentro del código fuente. Y es que, a la hora de la verdad, un contador suele desempeñar un papel más importante que simplemente contar el número de iteraciones que se han hecho. El valor que almacena también se puede utilizar dentro del bucle para realizar otros propósitos.


#### EJEMPLO
Escribir un programa JAVA que imprima por pantalla todos los valores de la tabla de multiplicar de un número entero cualquiera, desde el 1 hasta el 10. 
**ESTUDIO PREVIO**
Sin detenernos demasiado a pensar, este programa debería hacer:
1. Pedir que se introduzca un número por el teclado.
2. Leerlo.
3. Mostrar el resultado de multiplicar el número por 1.
4. Mostrar el resultado de multiplicar el número por 2.
…
12. Mostrar el resultado de multiplicar el número por 10.

De esta descripción se desprende que del paso 3 al 12 se están repitiendo órdenes, que seguramente pueden reemplazarse por una estructura de repetición. Concretamente hay 10 pasos entre los 3 y los 12, y en cada uno lo que se hace es más o menos lo mismo: multiplicar el valor introducido por un valor que cada vez se incrementa en 1. 
**VARIABLES**
i=contador donde vamos incrementando para garantizar que se realizan 10 iteraciones, también se usa para realizar la multiplicación.
numero=numero que vamos a leer por teclado para mostrar su tabla de multiplicar.
**PSEUDOCÓDIGO**
```code
Algoritmo tabla
	Leer numero;
	i=1;
	Mientras	 (i<11)
		multiplicacion = i*numero;
		Escribir i , "x" , numero , "=" , multiplicacion;
		i=i+1; 
	FinMientras
FinAlgoritmo
````

Y el código java podría ser el siguiente:
```java
/* 
 * Programa que muestra la tabla de multiplicar de un número.
 * 5-11-2022
 * Joaquin Rios
 */
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        // Se inicializa las variables.
        Scanner sc = new Scanner(System.in);
        int i, tabla;
        // Pregunta el número.
        System.out.print("¿Qué tabla de multiplicar quieres? ");
        tabla = sc.nextInt();
        // El contador servirá para realizar cálculos.
        i = 1;
        System.out.println("Tabla del " + tabla);
        while (i <= 10) {
            //Como 'resultado' solo se utiliza dentro del bucle y no es necesaria fuera
            //podemos declararla aqui
            int resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
            i = i + 1;
        }
        sc.close();

    }
}
````


### 2. Repetir al menos una vez: la sentencia ''do/while''

Aunque la sentencia while es más que suficiente para llevar a cabo prácticamente cualquier estructura de repetición, hay otras que mejor se adaptan a ciertos casos muy concretos. Su aportación consiste exclusivamente en facilitar la lectura del código o permitir llevar a cabo algunas tareas de forma automática.

La sentencia do/while permite repetir la ejecución del bucle mientras se verifique la condición lógica. A diferencia de la sentencia while, la condición se verifica al final de cada iteración. Por tanto, independientemente de cómo evalúe la condición, como mínimo siempre se llevará a cabo la primera iteración.

Al contrario que la sentencia while, la sentencia do/while no es tan común en los lenguajes de programación.

#### EJEMPLO
Hacer un programa en JAVA que imprima los números pares entre 0 y 100.
**ESTUDIO PREVIO**
Los números pares van de 2 en 2. Además empiezan en 2. 
Por tanto. necesitamos un contador que empiece en 2 y aumente en dicha cantidad el valor que mostramos por pantalla. Este proceso debe realizarlo hasta que muestre el valor 100.
**VARIABLE**
c = contador que genera los números pares.
**PSEUDOCODIGO**
```code
Algoritmo pares
c=2
Repetir	
    Escribir c;
    c=c+2 
Mientras(c<101)
FinAlgoritmo
 ````

Ahora que ya entendemos como resolver el problema, podemos crear el código JAVA:

```java
public class Ejemplo01 {

    public static void main(String[] args) {
        int c=2;
        do {
            System.out.println(c);
            c = c+2;
        } while (c<101);

    }
    
}
````



### 3. Repetir un número fijo de veces: la sentencia ''for''
En algunas situaciones especiales ya se conoce, a priori, la cantidad exacta de veces que habrá que repetir el bucle. En tal caso es útil disponer de un mecanismo que represente de forma más clara la declaración de una variable de control de tipo contador, la especificación de hasta dónde debe contarse, y que al final de cada iteración incremente o disminuya su valor de forma automática, en lugar de tener que hacerlo nosotros. Automatizar este último punto es muy importante, ya que evita que por un olvido no se haga y se acabe generando un bucle infinito.

> Olvidarse de modificar una variable contador es un error muy típico cuando se utilizan estructuras de repetición.
La sentencia for permite repetir un número determinado de veces un conjunto de instrucciones.

La mayoría de lenguajes suelen disponer del equivalente a esta sentencia.

#### Sintaxis y estructura
La sintaxis de esta sentencia en lenguaje Java es algo más compleja, ya que intervienen muchos factores. Hay que especificar tres apartados especiales separados por punto y coma (;):
```java
for (inicialización contador ; expresión booleana ; modificación contador) {
  Instrucciones para ejecutar dentro del bucle
}
````

La descripción de cada apartado es la siguiente:
- Inicialización contador: se trata de la inicialización de una variable de tipo numérico que servirá como contador. Es exactamente igual que asignar un valor a una variable cualquiera (identificador = valorInicial). Si se desea, se permite declarar la variable a la vez que se inicializa (tipo identificador = valorInicial).
- Expresión booleana: se trata de la condición lógica que indica si es necesario realizar una nueva iteración o no, al igual que en el resto de estructuras de repetición.
- Modificación: se trata de una instrucción que modifica el valor del contador, normalmente una asignación. Esta instrucción se ejecuta automáticamente al final de cada iteración. Puede ser tanto un incremento como una disminución del valor.

#### Ejemplo: la tabla de multiplicar, versión 2
La sentencia for se usa normalmente en lugar de while en casos en los que es necesaria una variable de control que va variando su valor en una cantidad fija a cada iteración, ya sea incrementándose o decreciendo. Es lo que ocurre, por ejemplo, con los casos controlados por un contador, como los primeros ejemplos de la sentencia while.

> **El operador postincremento/decremento**: Por poner un ejemplo de la sentencia for, se introducirán unos nuevos operadores unarios existentes en algunos lenguajes, como Java. Éstos son especialmente útiles para especificar el autoincremento en el tercer apartado de la sentencia for. Se trata del postincremento (++) y del postdecremento (--). 
> El resultado de aplicarlo es que se suma o resta 1 al valor de la variable, respectivamente. 
> La sintaxis es: `identificadorVariable++` e `identificadorVariable--`  en cada caso. 
> Por ejemplo: `i++`, `valor--`, etc.

A continuación se encuentra la adaptación a la sentencia for del ejemplo de la tabla de multiplicar. 

```java

/* 
 * Programa que muestra la tabla de multiplicar de un número.
 * 5-11-2022
 * Joaquin Rios
 */
import java.util.Scanner;

public class TablaMultiplicarFor {
    public static void main(String[] args) {
        // Se inicializa las variables.
        Scanner sc = new Scanner(System.in);
        int tabla=1; //En este caso no hace falta declarar 'i', aunque se puede hacer
        // Pregunta el número.
        System.out.print("¿Qué tabla de multiplicar quieres? ");
        tabla = sc.nextInt();
        sc.close();
        System.out.println("Tabla del " + tabla);
        // El contador servirá para realizar cálculos.
        // En lugar de 'i++' también se podría escribir 'i = i + 1'.
        for (int i = 0; i <= 10; i++) {
            int resultado = tabla * i;
            System.out.println(tabla + " x " + i + " = " + resultado);
        }
    }
}
```

Si lo ejecutamos, veremos que hace exactamente lo mismo.