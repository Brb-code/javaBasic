import java.util.Scanner;

public class PracJavaBasica2 {
    public static void main(String[] ijhm) {
        /*
         * 2. Solicita el usuario su nombre completo y el año de su nacimiento, 
         * utilizando un objeto del tipo Scanner captura ambos valores en variables 
         * del tipo adecuado. Luego imprima en pantalla el nombre de la persona 
         * e indique si es mayor o menor de edad:
         * Ej: Rodrigo Velez es <<mayor>> de edad por tener <<23>> años.
         */
        
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
