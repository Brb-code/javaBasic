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
