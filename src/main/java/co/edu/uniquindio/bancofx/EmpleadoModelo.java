package co.edu.uniquindio.bancofx;

import java.util.ArrayList;

public class EmpleadoModelo {

    private String nombre, cedula, codigo;
    private ArrayList<TransaccionModelo> listaTransacciones = new ArrayList<>();

    public EmpleadoModelo(String nombre, String cedula, String codigo){
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<TransaccionModelo> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setTransaccion (TransaccionModelo transaccion){
        listaTransacciones.add(transaccion);
    }
}
