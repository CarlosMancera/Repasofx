package co.edu.uniquindio.bancofx;

public class TransaccionModelo {

    private double valor;
    private String hora, fecha, estadoTransaccion, tipoTransaccion;

    public TransaccionModelo(double valor, String hora, String fecha){
        this.valor = valor;
        this.hora = hora;
        this.fecha = fecha;
    }
    public String getTipoTransaccion(){
        return tipoTransaccion;
    }
    public double getValor() {
        return valor;
    }


    public String getHora() {
        return hora;
    }

    public String getFecha() {
        return fecha;
    }


    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
}


