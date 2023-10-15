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