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
