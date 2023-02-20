package co.edu.uniquindio.bancofx;

public class ClienteModelo {

    private String nombre, apellido, cedula, direccion, email;
    private CuentaModelo cuentaUnica;

    public ClienteModelo(String nombre, String apellido, String cedula, String direccion, String email,
                         CuentaModelo cuentaUnica){
        this.nombre = nombre;
        this.apellido = apellido;
        this. cedula = cedula;
        this.direccion = direccion;
        this.email = email;
        this.cuentaUnica = cuentaUnica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CuentaModelo getCuentaUnica() {
        return cuentaUnica;
    }

    public void setCuentaUnica(CuentaModelo cuentaUnica) {
        this.cuentaUnica = cuentaUnica;
    }
}
