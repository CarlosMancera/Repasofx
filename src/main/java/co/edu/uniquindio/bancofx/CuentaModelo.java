package co.edu.uniquindio.bancofx;

public class CuentaModelo {

    private String numero;
    private double saldo;

    public CuentaModelo(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
