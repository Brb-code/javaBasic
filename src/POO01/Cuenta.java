package POO01;

public class Cuenta {
    private long nroCuenta;
    private String moneda;
    private double saldo;

    public Cuenta(){
        nroCuenta = 0;
        moneda = "BOLIVIANOS";
        saldo = 0.0;
    }
    public void verCuenta(){
        System.out.print("# de Cuenta: " + nroCuenta + "\nMoneda: " + moneda + "\nSaldo: " + saldo);
    }
    public void abrirCuenta(String moneda, double monto, short edad){
        if(edad >= 18) {            
            this.moneda = moneda;
            saldo = monto;
            System.out.println("SE RALIZO LA APERTURA DE LA CUENTA BANCARIA.");
        } else {
            System.out.println("LA PERSONA ES MENOR DE EDAD, POR LO QUE NO PUEDE ABRIR UNA CUENTA BANCARIA!!!");
        }
    }
    public double saldo(){
        return this.saldo;
    }
    public void depositarMonto(double deposito){
        if(deposito >= 0){
            this.saldo += deposito;
            System.out.println("SE REALIZO EL DEPOSITO CORRECTAMENTE.");
        }
        else
            System.out.println("EL MONTO DEBE SER MAYOR A 0 PARA REALIZAR EL DEPOSITO.");
    }
    public void retirarMonto(double retiro){
        if(retiro < 0)
            System.out.println("EL MONTO DEBE SER MAYOR A 0 PARA REALIZAR EL RETIRO.");
        else if(retiro > saldo)
            System.out.println("NO TIENE SALDO SUFICIENTE PARA EL MONTO QUE QUIERE RETIRAR.");
        else {
            this.saldo -= retiro;
            System.out.println("SE REALIZO EL RETIRO CORRECTAMENTE.");
        }            
    }
}
