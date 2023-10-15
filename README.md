# PRÁCTICA: JAVA BÁSICO

**_Elaborado por:_** Israel José Huallpara Mencias

**_Código fuente en:_** (https://github.com/Brb-code/javaBasic)

#### PRÁCTICA: POO – Estructuras de Datos

1. Escriba un programa que solicite al usuario la cantidad de notas que registrará. Luego capture todas estas notas en un arreglo de números con punto decimal. Mediante una estructura iterativa calcule el promedio de todas las notas contenidas en el arreglo y devuelva como resultado el promedio, también obtenga la nota más alta y la más baja.

```java
import java.util.Scanner;

public class PracJavaED1 {
    public static void main(String [] ijhm) {
        /*
         * Escriba un programa que solicite al usuario la cantidad de notas que registrará. 
         * Luego capture todas estas notas en un arreglo de números con punto decimal. 
         * Mediante una estructura iterativa calcule el promedio de todas las notas contenidas 
         * en el arreglo y devuelva como resultado el promedio, 
         * también obtenga la nota más alta y la más baja.
         */
        Scanner leer = new Scanner(System.in);

        int cntNotas;

        System.out.print("Ingrese la cantidad de notas que registrara: ");
        cntNotas = leer.nextInt();

        double notas[] = new double[cntNotas];

        for (int i = 0; i < cntNotas; i++) {
            System.out.println("Ingrese la nota nro. " + (i+1) + ": ");
            notas[i] = leer.nextDouble();
        }

        double suma = 0;
        double maximaNota = Double.MIN_VALUE;
        double minimaNota = Double.MAX_VALUE;

        for (double d : notas) {
            suma += d;
            maximaNota = d > maximaNota ? d: maximaNota;
            minimaNota = d < minimaNota ? d: minimaNota;
        }
        double promedio = suma / cntNotas;

        System.out.println("Promedio de notas: " + promedio + "\nMaxima nota: " + maximaNota + "\nMinima nota: " + minimaNota);
    }
}

```

[Código fuente](src/PracJavaED1.java)

```bash
# DEMO
Ingrese la cantidad de notas que registrara: 3
Ingrese la nota nro. 1: 
9,2
Ingrese la nota nro. 2: 
74,8
Ingrese la nota nro. 3: 
88
Promedio de notas: 57.333333333333336
Maxima nota: 88.0
Minima nota: 9.2
```

2. Realice un programa que solicite al usuario el ingreso del apellido y el salario un empleado, almacene los datos en estructuras ArrayList y LinkedList respectivamente; (el salario con punto decimal). Con un solo ciclo iterativo debe registrar los datos para ambas estructuras. Una vez llenas las estructuras, solicite al usuario un apellido y busque el mismo en la estructura correspondiente; si no encuentra se deberá imprimir el mensaje "No existe registro", si lo encuentra deberá imprimir el apellido y el salario asociado a ese apellido

```java
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class PracJavaED2 {
    public static void main(String [] ijhm) {
        /*
         * Realice un programa que solicite al usuario el ingreso del apellido y el salario un empleado, 
         * almacene los datos en estructuras ArrayList y LinkedList respectivamente; 
         * (el salario con punto decimal). Con un solo ciclo iterativo debe registrar los datos para ambas estructuras. 
         * Una vez llenas las estructuras, solicite al usuario un apellido y busque el mismo en la estructura correspondiente; 
         * si no encuentra se deberá imprimir el mensaje "No existe registro", si
         *  lo encuentra deberá imprimir el apellido y el salario asociado a ese apellido
         */

        Scanner leerTexto = new Scanner(System.in);
        Scanner leerNumero = new Scanner(System.in);

        int cntEmpleados;

        System.out.print("Ingrese la cantidad de empleados que registrara: ");
        cntEmpleados = leerNumero.nextInt();

        ArrayList apellidosList = new ArrayList<String>(cntEmpleados);
        LinkedList salarioList = new LinkedList<Double>();

        for (int i = 0; i < cntEmpleados; i++) {
            System.out.print("Introduzca el apellido del empleado (" + (i + 1) + "): ");
            apellidosList.add(leerTexto.nextLine().toUpperCase().trim());
            System.out.print("Introduzca el salario del empleado (" + (i + 1) + "): ");
            salarioList.add(leerNumero.nextDouble());
        }

        String apellidoBuscar;
        System.out.print("Ingrese el apellido a buscar: ");
        apellidoBuscar = leerTexto.nextLine();
        if(apellidosList.contains(apellidoBuscar.toUpperCase().trim())){
            int posicion= -1;
            for (int i = 0; i < apellidosList.size(); i++) {
                if(apellidosList.get(i).equals(apellidoBuscar.toUpperCase().trim()))
                    posicion = i;
            }
            System.out.println("Empleado: " + apellidosList.get(posicion) + "\nSalario: " + salarioList.get(posicion));
        } else
            System.out.print("No existe el registro");
    }
}
```

[Código fuente](src/PracJavaED2.java)

```bash
# DEMO
Ingrese la cantidad de empleados que registrara: 3
Introduzca el apellido del empleado (1): pepe
Introduzca el salario del empleado (1): 123
Introduzca el apellido del empleado (2): juana
Introduzca el salario del empleado (2): 222
Introduzca el apellido del empleado (3): grillo
Introduzca el salario del empleado (3): 92,2
Ingrese el apellido a buscar: grillo
Empleado: GRILLO
Salario: 92.2

```