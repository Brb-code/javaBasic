import java.util.Date;
import java.util.Scanner;

public class PracJavaBasica4 {
    public static void main(String[] ijhm) {
        /*
         * 4. Escriba un programa que solicite al usuario su salario neto que gana y el año que ingresó a trabajar. 
         * En base a esta información muestre un resumen de los descuentos de ley 
         * que se aplican a ese salario en base a los siguientes datos:
         *      - Aporte de vejez: 10%
         *      - Riesgo común: 1.71%
         *      - Comisiones: 0.5%
         *      - Aporte solidario: 0.5%
         * Además, muestre el cálculo, sobre el salario neto, de cuánto es el incremento que recibe por antigüedad:
         *      - De 5 a 9 años: 11%
         *      - De 10 a 14 años: 18%
         *      - De 15 a 19 años: 30%
         *      - De 20 años en adelante: 45%
         * Finalmente indique la cantidad de días de vacación que le corresponde de acuerdo a su antigüedad:
         *      - De 1 a 5 años: 15 días
         *      - De 5 a 10 años: 20 días
         *      - De 10 años en adelante: 30 dias
         */
        
        Scanner leer = new Scanner(System.in); // objeto del tipo Scanner
        
        // Definiendo constantes
        final double D_VEJEZ = 10; 
        final double D_RIESGO_COMUN = 1.71;
        final double D_COMISION = 0.5;
        final double D_APORTE_SOLIDARIO = 0.5;

        final double INC_5_9 = 11;
        final double INC_10_14 = 18;
        final double INC_15_19 = 30;
        final double INC_20_ = 45;


        double salarioNeto;
        int anioInicioTrabajo;

        System.out.print("Ingrese su salario neto: Bs. ");
        salarioNeto = leer.nextDouble();

        System.out.print("Ingrese el año que ingresó a trabajar: ");
        anioInicioTrabajo = leer.nextInt();

        System.out.println("Los descuentos de Ley que se aplicarán son: ");
        System.out.println("- APORTE DE VEJEZ (10 %) = " + (salarioNeto * (D_VEJEZ / 100)));
        System.out.println("- RIESGO COMÚN (1.71 %) = " + (salarioNeto * (D_RIESGO_COMUN / 100)));
        System.out.println("- COMISIONES (0.5 %) = " + (salarioNeto * (D_COMISION / 100)));
        System.out.println("- APORTE SOLIDARIO (0.5 %) = " + (salarioNeto * (D_APORTE_SOLIDARIO / 100)));
        
        
        int aniosTrabajados = new Date().getYear() + 1900 - anioInicioTrabajo;
        System.out.println("El incremento por antiguedad es:");
        String mensaje = "No tiene la antiguedad necesaria para la asignación de vacaciones";

        if(aniosTrabajados >= 5 && aniosTrabajados <= 9)
            mensaje = "Tiene " + aniosTrabajados + " años de trabajo, y le corresponde el 11 % de incremento, siendo: " + (salarioNeto * (INC_5_9 / 100));
        else if(aniosTrabajados >= 10 && aniosTrabajados <= 14)
            mensaje = "Tiene " + aniosTrabajados + " años de trabajo, y le corresponde el 18 % de incremento, siendo: " + (salarioNeto * (INC_10_14 / 100));
        else if(aniosTrabajados >= 15 && aniosTrabajados <= 19)
            mensaje = "Tiene " + aniosTrabajados + " años de trabajo, y le corresponde el 30 % de incremento, siendo: " + (salarioNeto * (INC_15_19 / 100));
        else if(aniosTrabajados >= 20)
            mensaje = "Tiene " + aniosTrabajados + " años de trabajo, le corresponde el 45 % de incremento, siendo: " + (salarioNeto * (INC_20_ / 100));
        System.out.println(mensaje);
        
        System.out.print("La Cantidad de días de vacaciones que le corresponde por " + aniosTrabajados +" años trabajados es: ");        

        if(aniosTrabajados >= 1 && aniosTrabajados <= 5)
            System.out.print("15 días.");
        else if(aniosTrabajados > 5 && aniosTrabajados <= 10)
            System.out.print("25 días.");
        else if(aniosTrabajados > 10)
            System.out.print("30 días.");
        else 
            System.out.print("0 días");
        
        leer.close();
    }
}
