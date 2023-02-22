package co.edu.uniquindio.bancofx;

import java.util.ArrayList;

public class BancoModelo {

    private final String nombre = "Unibanco";

    private ArrayList<ClienteModelo> listaClientes = new ArrayList<ClienteModelo>();
    private ArrayList<CuentaModelo> listaCuentas = new ArrayList<CuentaModelo>();
    private ArrayList<TransaccionModelo> listaTransacciones = new ArrayList<TransaccionModelo>();
    private ArrayList<EmpleadoModelo> listaEmpleados = new ArrayList<EmpleadoModelo>();

    public BancoModelo(){
        TransaccionModelo transaccionMaster = new TransRetiro(100000, "18:00", "22/02/2023");
        CuentaModelo cuentaMaster = new CuentaAhorros("666", 150000);

        listaCuentas.add(cuentaMaster);
        listaEmpleados.add(new EmpleadoModelo("Omar", "1981", "1981"));
        listaClientes.add(new ClienteModelo("Carlos", "Mancera","1234","Colinas","carlos@gmail.com", cuentaMaster));
        listaTransacciones.add(transaccionMaster);
    }


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
