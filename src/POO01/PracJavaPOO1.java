package POO01;

public class PracJavaPOO1 {
    public static void main(String [] ijhm){
        //Creando un cliente
        Cliente israel = new Cliente();
        israel.telefono = 123321;
        israel.anio_nacimiento = 1990;
        israel.verDatosBasicos();

        // Creando credito
        israel.solicitarCredito(10000);

        israel.pagarCuota();
        israel.pagarCuota();
        israel.pagarCuota();

        israel.verDatosCompletos();
    }
}
