import java.util.Scanner;

public class PracJavaBasica8 {
    public static void main(String[] ijhm) {
        /*
         * 8. Realice el siguiente programa: solicite al usuario que ingrese un número entre 5 y 20, 
         * si ingresa un número fuera de ese rango informe del error. 
         * Si el número está dentro del rango, utilice la estructura iterativa while 
         * para imprimir esa cantidad de números de la secuencia Fibonnacci separados por comas. 
         * (Fibonnacci es una secuencia infinita de números: a partir del 0 y el 1, 
         * se van sumando de manera que cada número es igual a la suma de sus dos anteriores: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…)
         */
        
        Scanner leer = new Scanner(System.in);
        int a = -1;
        int b = 1;
        int c;

        System.out.print("Ingrese un  número entre el 5 y 20: ");
        byte nro = leer.nextByte();

        if(nro >= 5 && nro <= 20){
            System.out.println("FIBONACCI");
            while(nro > 0) {
                c = a + b;
                a = b;
                b = c;
                nro--;
                System.out.print(c+", ");
            }
        } else 
            System.out.println("El número ingresado no es parte del rango permitido!.");
    }
}
