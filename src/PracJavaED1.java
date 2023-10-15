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