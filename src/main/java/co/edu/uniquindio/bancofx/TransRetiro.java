package co.edu.uniquindio.bancofx;

public class TransRetiro extends TransaccionModelo {

    public TransRetiro(double valor, String hora, String fecha){
        super(valor, hora, fecha);
        super.setTipoTransaccion("Retiro");
    }



}
