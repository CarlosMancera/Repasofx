package co.edu.uniquindio.bancofx;

public class CuentaAhorros extends CuentaModelo{

    private final double interesAnual = 0.05;

    public CuentaAhorros(String numero, double saldo){
        super(numero, saldo);
        super.setTipoCuenta("Ahorros");
    }
    public double getInteresAnual() {
        return interesAnual;
    }
}
