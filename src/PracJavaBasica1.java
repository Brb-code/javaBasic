public class PracJavaBasica1 {
    public static void main(String[] ijhm) {
        /*
         * 1. Escriba un programa en el que se declaren las variables enteras x e y. 
         * Asígnales los valores 144 y 999 respectivamente. 
         * A continuación, muestra por pantalla el valor de cada variable, 
         * la suma, la resta, la división y la multiplicación.
         */
        int x, y; // Declarando variables enteras
        
        x = 144;
        y = 999; //asignando valores

        int suma = x + y; // almacenando en suma el resultado de la suma entre x e y
        int resta = x - y; // almacenando en resta el resultado de la resta entre x e y
        int producto = x * y; // almacenando en producto el resultado de la multiplicación entre x e y
        int division = x / y; // almacenando en division el resultado de la división entre x e y

        System.out.println("x es igual a: " + x);
        System.out.println("y es igual a: " + y);

        System.out.println("x + y es igual a: " + suma);
        System.out.println("x - y es igual a: " + resta);
        System.out.println("x * y es igual a: " + producto);
        System.out.println("x / y es igual a: " + division);
    }
}
