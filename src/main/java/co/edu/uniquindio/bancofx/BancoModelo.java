package co.edu.uniquindio.bancofx;

import java.util.ArrayList;

public class BancoModelo {

    private final String nombre = "Unibanco";

    private ArrayList<ClienteModelo> listaClientes = new ArrayList<ClienteModelo>();
    private ArrayList<CuentaModelo> listaCuentas = new ArrayList<CuentaModelo>();
    private ArrayList<TransaccionModelo> listaTransacciones = new ArrayList<TransaccionModelo>();
    private ArrayList<EmpleadoModelo> listaEmpleados = new ArrayList<EmpleadoModelo>();




    //-------------------Métodos para agregar------------------

    public void setCliente (ClienteModelo cliente){
        listaClientes.add(cliente);
        listaCuentas.add(cliente.getCuentaUnica());
    }

    public void setEmpleado (EmpleadoModelo empleado){

        listaEmpleados.add(empleado);
    }

    public void setTransaccion(TransaccionModelo transaccion, EmpleadoModelo empleado){

        listaTransacciones.add(transaccion);
        empleado.setTransaccion(transaccion);

    }







    //--------------------Metodos Get para listas------------------------
    public ArrayList<ClienteModelo> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<CuentaModelo> getListaCuentas() {
        return listaCuentas;
    }

    public ArrayList<TransaccionModelo> getListaTransacciones() {
        return listaTransacciones;
    }

    public ArrayList<EmpleadoModelo> getListaEmpleados() {
        return listaEmpleados;
    }

}
