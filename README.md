# PRÁCTICA: JAVA BÁSICO

**_Elaborado por:_** Israel José Huallpara Mencias

**_Código fuente en:_** (https://github.com/Brb-code/javaBasic)

#### Desarrolle el código para resolver los siguientes enunciados:

1. Escriba un programa en el que se declaren las variables enteras x e y. Asígnales los valores 144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación.

```java
public class PracJavaBasica1 {
    public static void main(String[] ijhm) {

        int x, y; // Declarando variables enteras

        x = 144;
        y = 999; //asignando valores

        int suma = x + y; // almacenando en suma el resultado de la suma entre x e y
        int resta = x - y; // almacenando en resta el resultado de la resta entre x e y
        int producto = x * y; // almacenando en producto el resultado de la multiplicación entre x e y
        int division = x / y; // almacenando en division el resultado de la división entre x e y

        System.out.println("x es igual a: " + x);
        System.out.println("y es igual a: " + y);

        System.out.println("x + y es igual a: " + suma);
        System.out.println("x - y es igual a: " + resta);
        System.out.println("x * y es igual a: " + producto);
        System.out.println("x / y es igual a: " + division);
    }
}
```

[Código fuente](src/PracJavaBasica1.java)

```bash
# DEMO
x es igual a: 144
y es igual a: 999
x + y es igual a: 1143
x - y es igual a: -855
x * y es igual a: 143856
x / y es igual a: 0
```

2. Solicita el usuario su nombre completo y el año de su nacimiento, utilizando un objeto del tipo Scanner captura ambos valores en variables del tipo adecuado. Luego imprima en pantalla el nombre de la persona e indique si es mayor o menor de edad: Ej: Rodrigo Velez es <<mayor>> de edad por tener <<23>> años.

```java
import java.util.Scanner;

public class PracJavaBasica2 {
    public static void main(String[] ijhm) {

        Scanner leer = new Scanner(System.in); // objeto del tipo Scanner

        String nombreCompleto; // Declarando variable cadena
        int edad; // Declarando variable entera


        System.out.print("Ingrese su nombre completo: ");
        nombreCompleto = leer.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = leer.nextInt();

        String mayoriaDeEdad;
        if(edad < 18)
            mayoriaDeEdad = "MENOR";
        else
            mayoriaDeEdad = "MAYOR";

        System.out.println(nombreCompleto.trim().toUpperCase() + " es "+ mayoriaDeEdad +" de edad por tener " + edad + " años.");

        leer.close();
    }
}
```

[Código fuente](src/PracJavaBasica2.java)

```bash
#DEMO
Ingrese su nombre completo: israel huallpara
Ingrese su edad: 33
ISRAEL HUALLPARA es MAYOR de edad por tener 33 años.
```

3.  Declare dos constantes con factores de conversión de monedas con los siguientes valores: de Bolivianos a Dólares (6.96) y de Bolivianos a Euros (7.30). Solicite al usuario que ingrese un monto en Bolivianos y luego pregunte a qué moneda quiere realizar la conversión y en base a su respuesta muestre el resultado con redondeo a 2 decimales (utilice el método round de la librería Math).

    Ej: Bolivianos: 500, representan 71.8 Dólares

```java
import java.util.Scanner;

public class PracJavaBasica3 {
    public static void main(String[] ijhm) {

        Scanner leer = new Scanner(System.in); // objeto del tipo Scanner

        final double BS_DOLAR = 6.96; //Constante para el cambio de boliano a dolar
        final double BS_EURO = 7.30; //Constante para el cambio de boliano a euro

        double bsACambiar;
        byte opcion;
        System.out.print("Ingrese el monto en Bs. que desea cambiar: Bs. ");
        bsACambiar = leer.nextDouble();

        System.out.print("Seleccione la moneda a la que desea convertir los bolivianos: \n 1) DOLARES\n 2) EUROS\nOpción: ");
        opcion = leer.nextByte();

        switch(opcion){
            case 1:
                double res = Math.round((bsACambiar / BS_DOLAR) * 100);
                res /= 100;
                System.out.print("Con Bs. " + bsACambiar + ", usted convierte a $us. "+ res);
                break;
            case 2:
                res = Math.round((bsACambiar / BS_EURO) * 100) ;
                res /= 100;
                System.out.print("Con Bs. " + bsACambiar + ", usted convierte a €. "+ res);
                break;
            default:
                System.out.print("El número ingresado no es parte de las opciones. \n Gracias...");
        }

        leer.close();
    }
}

```

[Código fuente](src/PracJavaBasica3.java)

```bash
#DEMO
Ingrese el monto en Bs. que desea cambiar: Bs. 500
Seleccione la moneda a la que desea convertir los bolivianos:
 1) DOLARES
 2) EUROS
Opción: 1
Con Bs. 500.0, usted convierte a $us. 71.84

#DEMO
Ingrese el monto en Bs. que desea cambiar: Bs. 10
Seleccione la moneda a la que desea convertir los bolivianos:
 1) DOLARES
 2) EUROS
Opción: 2
Con Bs. 10.0, usted convierte a €. 1.37
```

4.  Escriba un programa que solicite al usuario su salario neto que gana y el año que ingresó a trabajar. En base a esta información muestre un resumen de los descuentos de ley que se aplican a ese salario en base a los siguientes datos:

- Aporte de vejez: 10%
- Riesgo común: 1.71%
- Comisiones: 0.5%
- Aporte solidario: 0.5%

Además, muestre el cálculo, sobre el salario neto, de cuánto es el incremento que recibe por antigüedad:

- De 5 a 9 años: 11%
- De 10 a 14 años: 18%
- De 15 a 19 años: 30%
- De 20 años en adelante: 45%

Finalmente indique la cantidad de días de vacación que le corresponde de acuerdo a su antigüedad:

- De 1 a 5 años: 15 días
- De 5 a 10 años: 20 días
- De 10 años en adelante: 30 dias

```java

import java.util.Date;
import java.util.Scanner;

public class PracJavaBasica4 {
    public static void main(String[] ijhm) {
        /*
         * 4. Escriba un programa que solicite al usuario su salario neto que gana y el año que ingresó a trabajar.
         * En base a esta información muestre un resumen de los descuentos de ley
         * que se aplican a ese salario en base a los siguientes datos:
         *      - Aporte de vejez: 10%
         *      - Riesgo común: 1.71%
         *      - Comisiones: 0.5%
         *      - Aporte solidario: 0.5%
         * Además, muestre el cálculo, sobre el salario neto, de cuánto es el incremento que recibe por antigüedad:
         *      - De 5 a 9 años: 11%
         *      - De 10 a 14 años: 18%
         *      - De 15 a 19 años: 30%
         *      - De 20 años en adelante: 45%
         * Finalmente indique la cantidad de días de vacación que le corresponde de acuerdo a su antigüedad:
         *      - De 1 a 5 años: 15 días
         *      - De 5 a 10 años: 20 días
         *      - De 10 años en adelante: 30 dias
         */

        Scanner leer = new Scanner(System.in); // objeto del tipo Scanner

        // Definiendo constantes
        final double D_VEJEZ = 10;
        final double D_RIESGO_COMUN = 1.71;
        final double D_COMISION = 0.5;
        final double D_APORTE_SOLIDARIO = 0.5;

        final double INC_5_9 = 11;
        final double INC_10_14 = 18;
        final double INC_15_19 = 30;
        final double INC_20_ = 45;


        double salarioNeto;
        int anioInicioTrabajo;

        System.out.print("Ingrese su salario neto: Bs. ");
        salarioNeto = leer.nextDouble();

        System.out.print("Ingrese el año que ingresó a trabajar: ");
        anioInicioTrabajo = leer.nextInt();

        System.out.println("Los descuentos de Ley que se aplicarán son: ");
        System.out.println("- APORTE DE VEJEZ (10 %) = " + (salarioNeto * (D_VEJEZ / 100)));
        System.out.println("- RIESGO COMÚN (1.71 %) = " + (salarioNeto * (D_RIESGO_COMUN / 100)));
        System.out.println("- COMISIONES (0.5 %) = " + (salarioNeto * (D_COMISION / 100)));
        System.out.println("- APORTE SOLIDARIO (0.5 %) = " + (salarioNeto * (D_APORTE_SOLIDARIO / 100)));


        int aniosTrabajados = new Date().getYear() + 1900 - anioInicioTrabajo;
        System.out.println("El incremento por antiguedad es:");
        String mensaje = "No tiene la antiguedad necesaria para la asignación de vacaciones";

        if(aniosTrabajados >= 5 && aniosTrabajados <= 9)
            mensaje = "Tiene " + aniosTrabajados + " años de trabajo, y le corresponde el 11 % de incremento, siendo: " + (salarioNeto * (INC_5_9 / 100));
        else if(aniosTrabajados >= 10 && aniosTrabajados <= 14)
            mensaje = "Tiene " + aniosTrabajados + " años de trabajo, y le corresponde el 18 % de incremento, siendo: " + (salarioNeto * (INC_10_14 / 100));
        else if(aniosTrabajados >= 15 && aniosTrabajados <= 19)
            mensaje = "Tiene " + aniosTrabajados + " años de trabajo, y le corresponde el 30 % de incremento, siendo: " + (salarioNeto * (INC_15_19 / 100));
        else if(aniosTrabajados >= 20)
            mensaje = "Tiene " + aniosTrabajados + " años de trabajo, le corresponde el 45 % de incremento, siendo: " + (salarioNeto * (INC_20_ / 100));
        System.out.println(mensaje);

        System.out.print("La Cantidad de días de vacaciones que le corresponde por " + aniosTrabajados +" años trabajados es: ");

        if(aniosTrabajados >= 1 && aniosTrabajados <= 5)
            System.out.print("15 días.");
        else if(aniosTrabajados > 5 && aniosTrabajados <= 10)
            System.out.print("25 días.");
        else if(aniosTrabajados > 10)
            System.out.print("30 días.");
        else
            System.out.print("0 días");

        leer.close();
    }
}


```

[Código fuente](src/PracJavaBasica4.java)

```bash
#DEMO
Ingrese su salario neto: Bs. 10000
Ingrese el año que ingresó a trabajar: 2020
Los descuentos de Ley que se aplicarán son:
- APORTE DE VEJEZ (10 %) = 1000.0
- RIESGO COMÚN (1.71 %) = 171.0
- COMISIONES (0.5 %) = 50.0
- APORTE SOLIDARIO (0.5 %) = 50.0
El incremento por antiguedad es:
No tiene la antiguedad necesaria para la asignación de vacaciones
La Cantidad de días de vacaciones que le corresponde por 3 años trabajados es: 15 días.

#DEMO
Ingrese su salario neto: Bs. 100
Ingrese el año que ingresó a trabajar: 2023
Los descuentos de Ley que se aplicarán son:
- APORTE DE VEJEZ (10 %) = 10.0
- RIESGO COMÚN (1.71 %) = 1.71
- COMISIONES (0.5 %) = 0.5
- APORTE SOLIDARIO (0.5 %) = 0.5
El incremento por antiguedad es:
No tiene la antiguedad necesaria para la asignación de vacaciones
La Cantidad de días de vacaciones que le corresponde por 0 años trabajados es: 0 días

#DEMO
Ingrese su salario neto: Bs. 4000
Ingrese el año que ingresó a trabajar: 2000
Los descuentos de Ley que se aplicarán son:
- APORTE DE VEJEZ (10 %) = 400.0
- RIESGO COMÚN (1.71 %) = 68.4
- COMISIONES (0.5 %) = 20.0
- APORTE SOLIDARIO (0.5 %) = 20.0
El incremento por antiguedad es:
Tiene 23 años de trabajo, le corresponde el 45 % de incremento, siendo: 1800.0
La Cantidad de días de vacaciones que le corresponde por 23 años trabajados es: 30 días.
```

5. Escriba un programa usando el bucle for, para obtener la suma de los primero 100
   números enteros.

```java

import java.util.Scanner;

public class PracJavaBasica5 {
    public static void main(String[] ijhm) {
        /*
         * 5. Escriba un programa usando el bucle for, para obtener la suma de los primero 100 números enteros.
         */


        // Definiendo constantes
        final int LIMITE = 100;

        int suma = 0;

        for(int i = 1; i <= LIMITE;  i++)
            suma += i;

        System.out.println("La sumatoria de los primeros "+ LIMITE+" numeros es: "+suma);
    }
}
```

[Código fuente](src/PracJavaBasica5.java)

```bash
#DEMO
La sumatoria de los primeros 100 numeros es: 5050
```

6. Realice el siguiente programa: solicite al usuario que ingrese un número entre 5 y 20, si ingresa un número fuera de ese rango informe del error. Si el número está dentro del rango, utilice la estructura iterativa for para encontrar cuál es el factorial de ese número y muestre en pantalla el resultado. (factorial es la cantidad que resulta de la multiplicación de un determinado número, por todos los números que le anteceden excluyendo el cero: 4! = 4x3x2x1 = 24)
   Ej: El factorial de 5 es: 120

```java

import java.util.Scanner;

public class PracJavaBasica6 {
    public static void main(String[] ijhm) {
        /*
         * 6. Realice el siguiente programa: solicite al usuario que ingrese un número entre 5 y 20,
         * si ingresa un número fuera de ese rango informe del error.
         * Si el número está dentro del rango, utilice la estructura iterativa for
         * para encontrar cuál es el factorial de ese número y muestre en pantalla
         * el resultado. (factorial es la cantidad que resulta de la Lenguajes de programación JAVA
         * multiplicación de un determinado número, por todos los números que le anteceden excluyendo el cero:
         * 4! = 4x3x2x1 = 24)
         * Ej: El factorial de 5 es: 120
         */

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un  número entre el 5 y 20: ");
        byte nro = leer.nextByte();

        if(nro >= 5 && nro <= 20){
            int factorial  = 1;
            while(nro > 0) {
                factorial *= nro;
                nro--;
            }
            System.out.println("El factorial es: " + factorial);
        } else
            System.out.println("El número ingresado no es parte del rango permitido!.");
    }
}

```

[Código fuente](src/PracJavaBasica6.java)

```bash
#DEMO
Ingrese un  número entre el 5 y 20: 2
El número ingresado no es parte del rango permitido!.

#DEMO
Ingrese un  número entre el 5 y 20: 5
El factorial es: 120

#DEMO
Ingrese un  número entre el 5 y 20: 8
El factorial es: 40320
```

7. Utilizando la estructura iterativa while, solicite al usuario que vaya ingresando números enteros hasta que ingrese el cero para terminar el ciclo. Al final muestre un resumen de la cantidad de números ingresados, la sumatoria de los números ingresados, el promedio, la cantidad de números pares y la cantidad de números impares.

Ejemplo:

- Cantidad de números ingresados: 8
- Suma de los números ingresados: 209
- Promedio de los números ingresados: 26.12
- Cantidad de pares ingresados: 3
- Cantidad de impares ingresados: 5

```java

import java.util.Scanner;

public class PracJavaBasica7 {
    public static void main(String[] ijhm) {
        /*
         * 7. Utilizando la estructura iterativa while, solicite al usuario que vaya ingresando números
         * enteros hasta que ingrese el cero para terminar el ciclo.
         * Al final muestre un resumen de la cantidad de números ingresados,
         * la sumatoria de los números ingresados, el promedio, la cantidad de números pares y la cantidad de números impares.
         * Ejemplo:
         * - Cantidad de números ingresados: 8
         * - Suma de los números ingresados: 209
         * - Promedio de los números ingresados: 26.12
         * - Cantidad de pares ingresados: 3
         * - Cantidad de impares ingresados: 5
         */

        Scanner leer = new Scanner(System.in);

        int nro = -1;
        int suma = 0;
        int pares = 0;
        int impares = 0;

        int cantidad = 0;
        while(nro != 0) {
            System.out.print("Ingrese un número entero, si ingresa el nro cero(0) concluirá el programa: ");
            nro = leer.nextInt();

            if(nro != 0){
                cantidad++;
                suma += nro;
                pares += nro % 2 == 0 ? 1 : 0;
                impares += nro % 2 != 0 ? 1 : 0;
            }
        }
        System.out.println("Se concluyó el programa, usted ingresó:");
        System.out.println("Cantidad de números ingresaados: "+ cantidad);
        System.out.println("Suma de números ingresaados: "+ suma);
        System.out.println("Promedio de los números ingresado: "+ (suma / cantidad));
        System.out.println("Cantidad de pares: "+ pares);
        System.out.println("Cantidad de impares: "+ impares);

    }
}

```

[Código fuente](src/PracJavaBasica7.java)

```bash
#DEMO
Ingrese un número entero, si ingresa el nro cero(0) concluirá el programa: 1
Ingrese un número entero, si ingresa el nro cero(0) concluirá el programa: 2
Ingrese un número entero, si ingresa el nro cero(0) concluirá el programa: 3
Ingrese un número entero, si ingresa el nro cero(0) concluirá el programa: 4
Ingrese un número entero, si ingresa el nro cero(0) concluirá el programa: 5
Ingrese un número entero, si ingresa el nro cero(0) concluirá el programa: 0
Se concluyó el programa, usted ingresó:
Cantidad de números ingresaados: 5
Suma de números ingresaados: 15
Promedio de los números ingresado: 3
Cantidad de pares: 2
Cantidad de impares: 3
```

8. Realice el siguiente programa: solicite al usuario que ingrese un número entre 5 y 20, si
   ingresa un número fuera de ese rango informe del error. Si el número está dentro del
   rango, utilice la estructura iterativa while para imprimir esa cantidad de números de la
   secuencia Fibonnacci separados por comas.
   (Fibonnacci es una secuencia infinita de
   números: a partir del 0 y el 1, se van sumando de manera que cada número es igual a la
   suma de sus dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…)

```java

import java.util.Scanner;

public class PracJavaBasica8 {
    public static void main(String[] ijhm) {
        /*
         * 8. Realice el siguiente programa: solicite al usuario que ingrese un número entre 5 y 20,
         * si ingresa un número fuera de ese rango informe del error.
         * Si el número está dentro del rango, utilice la estructura iterativa while
         * para imprimir esa cantidad de números de la secuencia Fibonnacci separados por comas.
         * (Fibonnacci es una secuencia infinita de números: a partir del 0 y el 1,
         * se van sumando de manera que cada número es igual a la suma de sus dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…)
         */

        Scanner leer = new Scanner(System.in);
        int a = -1;
        int b = 1;
        int c;

        System.out.print("Ingrese un  número entre el 5 y 20: ");
        byte nro = leer.nextByte();

        if(nro >= 5 && nro <= 20){
            System.out.println("FIBONACCI");
            while(nro > 0) {
                c = a + b;
                a = b;
                b = c;
                nro--;
                System.out.print(c+", ");
            }
        } else
            System.out.println("El número ingresado no es parte del rango permitido!.");
    }
}


```

[Código fuente](src/PracJavaBasica8.java)

```bash
#DEMO
Ingrese un  número entre el 5 y 20: 30
El número ingresado no es parte del rango permitido!.

#DEMO
Ingrese un  número entre el 5 y 20: 10
FIBONACCI
0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
```
