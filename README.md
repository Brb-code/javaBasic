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

3. Realice el siguiente programa con POO:

CLASE CUENTA

- Esta será clase que almacene como privados sus atributos: número de cuenta, moneda y saldo.

Métodos:

- verCuenta(): debe imprimir los datos de la cuenta.
- abrirCuenta(): se le debe indicar en qué moneda quiere abrir la cuenta y el monto que depositará en la misma. Primero se verificará que el cliente sea mayor de edad, si no lo es no se permitirá la apertura de la cuenta; si es mayor de edad se creará la cuenta.
- consultar saldo(): mostrará el saldo disponible
- depositarMonto(): se le deberá pasar el monto que se está depositando, el cual deberá ser sumado al saldo que se tenga disponible.
- retirarMonto(): se le pasará el monto de dinero que se quiere retirar y antes de generar el retiro se debe verificar que existe saldo suficiente. Si no existe saldo suficiente se deberá mostrar en un mensaje y se le pedirá que retire menos dinero. En caso que si
  exista el saldo suficiente se le descontará el mismo del saldo actual y se mostrará un mensaje en pantalla diciendo la el retiro fue exitoso

CLASE CRÉDITO

- Esta clase tendrá atributos que almacenen: el montoPrestado, saldoActual y un arreglo para almacenar los 12 pagos del crédito. El crédito se pagará siempre en 12 cuotas, para hacer los cálculos al monto prestado se le incrementa el 40% y el resultado se lo divide
  entre 12, este es el valor de lo que debe pagarse en cada cuota.

Métodos:

- abonarCuota(): se revisará primero si aún tiene cuotas pendientes, si ya canceló las 12 cuotas se deberá indicar en un mensaje; si tiene cuotas pendientes, entonces deberá ser pagada la siguiente y se mostrará en pantalla el número de cuota que se canceló (ejemplo "Acaba de cancelar la cuota 8"), se deberá actualizar el saldo adeudado y se mostrará también en pantalla cuanto es este saldo.
- verDetalle(): deberá imprimir en pantalla el Monto prestado, el monto por cuota, la cantidad de cuotas que ya pagó y el saldo adeudado.

CLASE CLIENTE

- Tendrá los siguientes atributos privados: carnet, nombre, cuenta y crédito; y otros atributos públicos: teléfono y año de nacimiento.

Métodos:

- verDatosBasicos(): deberá imprimir sololos datos básicos del cliente (sin incluir cuenta ni crédito).
- verDatosCompletos(): deberá imprimir los datos básicos del cliente incluidos el número de cuenta y el crédito si los tuviera.
- solicitarCredito(): Se le pasará el monto que se está solicitando como crédito. Primero se verifica que el cliente no tenga ya un crédito, si lo tiene, se mostrarán los detalles del crédito y se le mostrará un mensaje que diga que debe terminar de pagar el crédito
  antes de sacar otro. Si no tiene un crédito, se creará su crédito y se mostrará la cantidad de cuotas con el monto correspondiente a cada cuota.
- pagarCuota(): se llamará al método abonarCuota() de la clase crédito.

MAIN:

- En el programa principal debe realizar pruebas de funcionamiento

Clase Cuenta

```java
package POO01;

public class Cuenta {
    private long nroCuenta;
    private String moneda;
    private double saldo;

    public Cuenta(){
        nroCuenta = 0;
        moneda = "BOLIVIANOS";
        saldo = 0.0;
    }
    public void verCuenta(){
        System.out.print("# de Cuenta: " + nroCuenta + "\nMoneda: " + moneda + "\nSaldo: " + saldo);
    }
    public void abrirCuenta(String moneda, double monto, short edad){
        if(edad >= 18) {
            this.moneda = moneda;
            saldo = monto;
            System.out.println("SE RALIZO LA APERTURA DE LA CUENTA BANCARIA.");
        } else {
            System.out.println("LA PERSONA ES MENOR DE EDAD, POR LO QUE NO PUEDE ABRIR UNA CUENTA BANCARIA!!!");
        }
    }
    public double saldo(){
        return this.saldo;
    }
    public void depositarMonto(double deposito){
        if(deposito >= 0){
            this.saldo += deposito;
            System.out.println("SE REALIZO EL DEPOSITO CORRECTAMENTE.");
        }
        else
            System.out.println("EL MONTO DEBE SER MAYOR A 0 PARA REALIZAR EL DEPOSITO.");
    }
    public void retirarMonto(double retiro){
        if(retiro < 0)
            System.out.println("EL MONTO DEBE SER MAYOR A 0 PARA REALIZAR EL RETIRO.");
        else if(retiro > saldo)
            System.out.println("NO TIENE SALDO SUFICIENTE PARA EL MONTO QUE QUIERE RETIRAR.");
        else {
            this.saldo -= retiro;
            System.out.println("SE REALIZO EL RETIRO CORRECTAMENTE.");
        }
    }
}
```

[Código fuente](src/POO01/Cuenta.java)

Clase Credito

```java
package POO01;

public class Credito {
    private double montoPrestado;
    private double saldoActual;
    private double[] pagos;

    public Credito() {
        montoPrestado = 0;
        saldoActual = 0;
        pagos = new double[12];
    }

    public void abonarCuota() {
        int cantidadPagos = 0;
        for (int i = 0; i < pagos.length && cantidadPagos == 0; i++) {
            if (pagos[i] > 0.0)
                cantidadPagos = i + 1;
        }

        if (cantidadPagos < 12) {
            double couta = (montoPrestado + (montoPrestado * 0.4)) / 12;
            pagos[cantidadPagos] = couta;
            saldoActual -= couta;
            System.out.println(
                    "Acaba de cancelar la cuota " + (cantidadPagos + 1) + "\nTiene un saldo de Bs. " + saldoActual);
        } else {
            System.out.println("Ya fueron canceladas las 12 cuotas");
        }
    }

    public void verDetalle() {
        double couta = (montoPrestado + (montoPrestado * 0.4)) / 12;
        System.out.println("Monto prestado: Bs. " + montoPrestado + "\nMonto de cuota: Bs. " + couta
                + "\nCuotas canceladas: " + pagos.length + "\nSaldo adeudado: Bs. " + saldoActual);
    }

    public void iniciarCredito(double monto) {
        montoPrestado = monto;
        saldoActual = montoPrestado + (montoPrestado * 0.4);
        pagos = new double[12];
        System.out.println("Su plan de cuotas es: 12 x Bs. " + saldoActual / 12);
    }
}

```

[Código fuente](src/POO01/Credito.java)

Clase Cliente

```java
package POO01;

public class Cliente {
    private long carnet;
    private String nombre;
    private Cuenta cuenta;
    private Credito credito;
    public long telefono;
    public short anio_nacimiento;

    public Cliente(){
        carnet = 0;
        nombre = "";
        cuenta = null;
        credito = null;
        telefono = 0;
        anio_nacimiento = 0;
    }
    public void verDatosBasicos(){
        System.out.println("Carnet: " + carnet + "\nNombre: " + nombre + "\nTelefono: " + telefono + "\nAnio de nacimiento: " + anio_nacimiento);
    }
    public void verDatosCompletos(){
        verDatosBasicos();
        if(cuenta != null) cuenta.verCuenta();
        if(credito != null) credito.verDetalle();
    }
    public void solicitarCredito(double monto){
        if(credito == null){
            credito = new Credito();
            credito.iniciarCredito(monto);
        } else {
            System.out.println("Ya se cuenta con un credito previo, el cual debe de pagarlo antes de solicitar otro.");
            credito.verDetalle();
        }
    }
    public void pagarCuota(){
        credito.abonarCuota();
    }
}
```

[Código fuente](src/POO01/Cliente.java)

Programa principal

```java
package POO01;

public class PracJavaPOO1 {
    public static void main(String [] ijhm){
        //Creando un cliente
        Cliente israel = new Cliente();
        israel.telefono = 123321;
        israel.anio_nacimiento = 1990;
        israel.verDatosBasicos();

        // Creando credito
        israel.solicitarCredito(10000);

        israel.pagarCuota();
        israel.pagarCuota();
        israel.pagarCuota();

        israel.verDatosCompletos();
    }
}

```

[Código fuente](src/POO01/PracJavaPOO1.java)

```bash
# DEMO
Carnet: 0
Nombre:
Telefono: 123321
Anio de nacimiento: 1990
Su plan de cuotas es: 12 x Bs. 1166.6666666666667
Acaba de cancelar la cuota 1
Tiene un saldo de Bs. 12833.333333333334
Acaba de cancelar la cuota 2
Tiene un saldo de Bs. 11666.666666666668
Acaba de cancelar la cuota 2
Tiene un saldo de Bs. 10500.000000000002
Carnet: 0
Nombre:
Telefono: 123321
Anio de nacimiento: 1990
Monto prestado: Bs. 10000.0
Monto de cuota: Bs. 1166.6666666666667
Cuotas canceladas: 12
Saldo adeudado: Bs. 10500.000000000002

```

4. Cree una estructura del tipo pila (stack) que gestione objetos del tipo Cliente, cree varios clientes y haga pruebas de funcionamiento de la pila utilizando sus métodos.

```java
package POO01;

import java.util.Stack;

public class PracJavaPOO2 {
    public static void main(String[] ijhm) {
        /*
         * 4. Cree una estructura del tipo pila (stack) que gestione objetos del tipo
         * Cliente, cree varios clientes y haga pruebas de funcionamiento de la pila
         * utilizando sus métodos.
         */
        // Creando un cliente
        Cliente clA = new Cliente();
        clA.anio_nacimiento = 1;
        Cliente clB = new Cliente();
        clB.anio_nacimiento = 2;
        Cliente clC = new Cliente();
        clC.anio_nacimiento = 3;
        Cliente clD = new Cliente();
        clD.anio_nacimiento = 4;

        Stack pila = new Stack<Cliente>();

        pila.push(clA);
        pila.push(clB);
        Cliente tmp = (Cliente) pila.pop();
        tmp.verDatosBasicos();
        pila.push(clC);
        pila.push(clD);

        while (!pila.isEmpty()) {
            tmp = (Cliente) pila.pop();
            tmp.verDatosBasicos();
        }
    }
}


```

[Código fuente](src/POO01/PracJavaPOO2.java)

```bash
# DEMO
Carnet: 0
Nombre:
Telefono: 0
Anio de nacimiento: 2
Carnet: 0
Nombre:
Telefono: 0
Anio de nacimiento: 4
Carnet: 0
Nombre:
Telefono: 0
Anio de nacimiento: 3
Carnet: 0
Nombre:
Telefono: 0
Anio de nacimiento: 1

```

5. Cree una estructura del tipo cola (queue) que gestione objetos del tipo Cliente, cree
   varios clientes y haga pruebas de funcionamiento de la cola utilizando sus métodos.

```java
package POO01;

import java.util.LinkedList;
import java.util.Queue;

public class PracJavaPOO3 {
    public static void main(String[] ijhm) {
        /*
         * 5. Cree una estructura del tipo cola (queue) que gestione objetos del tipo
         * Cliente,
         * cree varios clientes y haga pruebas de funcionamiento de la cola utilizando
         * sus métodos.
         */

        // Creando un cliente
        Cliente clA = new Cliente();
        clA.anio_nacimiento = 1;
        Cliente clB = new Cliente();
        clB.anio_nacimiento = 2;
        Cliente clC = new Cliente();
        clC.anio_nacimiento = 3;
        Cliente clD = new Cliente();
        clD.anio_nacimiento = 4;

        Queue cola = new LinkedList<Cliente>();

        cola.add(clA);
        cola.add(clB);
        Cliente tmp = (Cliente) cola.poll();
        tmp.verDatosBasicos();
        cola.add(clC);
        cola.add(clD);
        while (!cola.isEmpty()) {
            tmp = (Cliente) cola.poll();
            tmp.verDatosBasicos();
        }
    }
}

```

[Código fuente](src/POO01/PracJavaPOO3.java)

```bash
# DEMO
Carnet: 0
Nombre:
Telefono: 0
Anio de nacimiento: 1
Carnet: 0
Nombre:
Telefono: 0
Anio de nacimiento: 2
Carnet: 0
Nombre:
Telefono: 0
Anio de nacimiento: 3
Carnet: 0
Nombre:
Telefono: 0
Anio de nacimiento: 4
```
