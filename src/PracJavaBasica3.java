import java.util.Scanner;

public class PracJavaBasica3 {
    public static void main(String[] ijhm) {
        /*
         * 3. Declare dos constantes con factores de conversión de monedas 
         * con los siguientes valores: de Bolivianos a Dólares (6.96)
         * y de Bolivianos a Euros (7.30). 
         * Solicite al usuario que ingrese un monto en Bolivianos y luego pregunte 
         * a qué moneda quiere realizar la conversión y en base a su respuesta 
         * muestre el resultado con redondeo a 2 decimales 
         * (utilice el método round de la librería Math).
         *          Ej: Bolivianos: 500, representan 71.8 Dólares
         */
        
        Scanner leer = new Scanner(System.in); // objeto del tipo Scanner
        
        final double BS_DOLAR = 6.96; //Constante para el cambio de boliano a dolar
        final double BS_EURO = 7.30; //Constante para el cambio de boliano a euro

        double bsACambiar;
        byte opcion;
        System.out.print("Ingrese el monto en Bs. que desea cambiar: Bs. ");
        bsACambiar = leer.nextDouble();

        System.out.print("Seleccione la moneda a la que desea convertir los bolivianos: \n 1) DOLARES\n 2) EUROS\nOpción: ");
        opcion = leer.nextByte();

        switch(opcion){
            case 1:
                double res = Math.round((bsACambiar / BS_DOLAR) * 100);
                res /= 100;
                System.out.print("Con Bs. " + bsACambiar + ", usted convierte a $us. "+ res);
                break;
            case 2:
                res = Math.round((bsACambiar / BS_EURO) * 100) ;
                res /= 100;
                System.out.print("Con Bs. " + bsACambiar + ", usted convierte a €. "+ res);
                break;
            default:
                System.out.print("El número ingresado no es parte de las opciones. \n Gracias...");
        }
        
        leer.close();
    }
}
