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
