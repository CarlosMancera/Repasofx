package co.edu.uniquindio.bancofx;

public class TransDeposito extends TransaccionModelo {

    public TransDeposito(double valor, String hora, String fecha){
        super(valor, hora, fecha);
        super.setTipoTransaccion("Deposito");
    }


}
