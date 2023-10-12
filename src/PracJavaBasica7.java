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
