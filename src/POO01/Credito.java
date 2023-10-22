package POO01;

public class Credito {
    private double montoPrestado;
    private double saldoActual;
    private double[] pagos;

    public Credito() {
        montoPrestado = 0;
        saldoActual = 0;
        pagos = new double[12];
    }

    public void abonarCuota() {
        int cantidadPagos = 0;
        for (int i = 0; i < pagos.length && cantidadPagos == 0; i++) {
            if (pagos[i] > 0.0)
                cantidadPagos = i + 1;
        }

        if (cantidadPagos < 12) {
            double couta = (montoPrestado + (montoPrestado * 0.4)) / 12;
            pagos[cantidadPagos] = couta;
            saldoActual -= couta;
            System.out.println(
                    "Acaba de cancelar la cuota " + (cantidadPagos + 1) + "\nTiene un saldo de Bs. " + saldoActual);
        } else {
            System.out.println("Ya fueron canceladas las 12 cuotas");
        }
    }

    public void verDetalle() {
        double couta = (montoPrestado + (montoPrestado * 0.4)) / 12;
        System.out.println("Monto prestado: Bs. " + montoPrestado + "\nMonto de cuota: Bs. " + couta
                + "\nCuotas canceladas: " + pagos.length + "\nSaldo adeudado: Bs. " + saldoActual);
    }

    public void iniciarCredito(double monto) {
        montoPrestado = monto;
        saldoActual = montoPrestado + (montoPrestado * 0.4);
        pagos = new double[12];
        System.out.println("Su plan de cuotas es: 12 x Bs. " + saldoActual / 12);
    }
}
