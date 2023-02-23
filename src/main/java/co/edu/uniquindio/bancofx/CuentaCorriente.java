package co.edu.uniquindio.bancofx;

public class CuentaCorriente extends CuentaModelo {

    private final double interesAnual = 0.02;

    public CuentaCorriente(String numero, double saldo){
        super(numero, saldo);
        super.setTipoCuenta("Corriente");
    }

    public double getInteresAnual() {
        return interesAnual;
    }
}
