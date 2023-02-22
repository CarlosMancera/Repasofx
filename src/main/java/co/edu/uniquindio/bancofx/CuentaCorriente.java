package co.edu.uniquindio.bancofx;

public class CuentaCorriente extends CuentaModelo {

    private final double interesAnual = 0.02;

    public CuentaCorriente(String numero, double saldo){
        super(numero, saldo);
    }

    public double getInteresAnual() {
        return interesAnual;
    }
}
