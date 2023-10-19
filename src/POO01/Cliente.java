package POO01;

public class Cliente {
    private long carnet;
    private String nombre;
    private Cuenta cuenta;
    private Credito credito;
    public long telefono;
    public short anio_nacimiento;

    public Cliente(){
        carnet = 0;
        nombre = "";
        cuenta = null;
        credito = null;
        telefono = 0;
        anio_nacimiento = 0;
    }
    public void verDatosBasicos(){
        System.out.println("Carnet: " + carnet + "\nNombre: " + nombre + "\nTelefono: " + telefono + "\nAnio de nacimiento: " + anio_nacimiento);
    }
    public void verDatosCompletos(){
        verDatosBasicos();
        if(cuenta != null) cuenta.verCuenta();
        if(credito != null) credito.verDetalle();
    }
    public void solicitarCredito(double monto){
        if(credito == null){
            credito = new Credito();
            credito.iniciarCredito(monto);
        } else {
            System.out.println("Ya se cuenta con un credito previo, el cual debe de pagarlo antes de solicitar otro.");
            credito.verDetalle();
        }
    }
    public void pagarCuota(){
        credito.abonarCuota();
    }
}
