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
