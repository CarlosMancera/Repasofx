package co.edu.uniquindio.bancofx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuClienteController implements Initializable {

    @FXML
    private Button btnAgregarCliente;

    @FXML
    private Button btnEditarCliente;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private TableColumn<?, ?> colApellido;

    @FXML
    private TableColumn<?, ?> colCedula;

    @FXML
    private TableColumn<?, ?> colCuenta;

    @FXML
    private TableColumn<?, ?> colDireccion;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableColumn<?, ?> colSaldo;

    @FXML
    private TableView<CuentaModelo> tblCuentaCliente;

    @FXML
    private TableView<ClienteModelo> tblListaClientes;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNumeroCuenta;

    @FXML
    private TextField txtSaldoCuenta;

    @FXML
    private TextField txtTipoCuenta;

    ObservableList<ClienteModelo> clientes;
    ObservableList<CuentaModelo> cuentas;

    public void initialize(URL url, ResourceBundle rb) {

        clientes = FXCollections.observableArrayList();

        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        this.colCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        this.colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        this.colDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));

        for (ClienteModelo e : UnibancoApplication.unibanco.getListaClientes()) {
            this.clientes.add(e);
            this.tblListaClientes.setItems(clientes);

        }
        cuentas = FXCollections.observableArrayList();

        this.colCuenta.setCellValueFactory(new PropertyValueFactory<>("numero"));
        this.colSaldo.setCellValueFactory(new PropertyValueFactory<>("saldo"));

        for (CuentaModelo c : UnibancoApplication.unibanco.getListaCuentas()) {
            this.cuentas.add(c);
            this.tblCuentaCliente.setItems(cuentas);

        }
    }

    @FXML
    void agregarCliente(ActionEvent event) {

        CuentaModelo cuenta = null;
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        String cedula = this.txtCedula.getText();
        String direccion = this.txtDireccion.getText();
        String email = this.txtEmail.getText();

        String numero = this.txtNumeroCuenta.getText();
        String tipoCuenta = this.txtTipoCuenta.getText();
        double saldo = Double.parseDouble(this.txtSaldoCuenta.getText());

        if(tipoCuenta.equalsIgnoreCase("ahorros")){
            cuenta = new CuentaAhorros(numero, saldo);
        } else if (tipoCuenta.equalsIgnoreCase("corriente")) {
            cuenta = new CuentaCorriente(numero, saldo);
        }

        ClienteModelo cliente = new ClienteModelo(nombre, apellido, cedula, direccion, email, cuenta);
        UnibancoApplication.unibanco.setCliente(cliente);

        this.clientes.add(cliente);
        this.tblListaClientes.setItems(clientes);

        this.cuentas.add(cuenta);
        this.tblCuentaCliente.setItems(cuentas);


    }

    @FXML
    void editarCliente(ActionEvent event) {

        ClienteModelo clienteModelo = this.tblListaClientes.getSelectionModel().getSelectedItem();

        if( clienteModelo == null){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar un cliente");
            alert.showAndWait();

        }else{
            String nombre = this.txtNombre.getText();
            String apellido = this.txtApellido.getText();
            String cedula = this.txtCedula.getText();
            String direccion = this.txtDireccion.getText();
            String email = this.txtEmail.getText();
            String numeroCuenta = this.txtNumeroCuenta.getText();
            String tipoCuenta = this.txtTipoCuenta.getText();
            double saldoCuenta = Double.parseDouble(this.txtSaldoCuenta.getText());
            CuentaModelo cuenta = null;

            if(tipoCuenta.equalsIgnoreCase("ahorros")){
                cuenta = new CuentaAhorros(numeroCuenta, saldoCuenta);
            } else if (tipoCuenta.equalsIgnoreCase("corriente")) {
                cuenta = new CuentaCorriente(numeroCuenta, saldoCuenta);
            }

            ClienteModelo clienteAux = new ClienteModelo(nombre, apellido, cedula, direccion, email,cuenta);

            if(!this.clientes.contains(clienteAux)){
                this.clientes.remove(clienteModelo);
                this.clientes.add(clienteAux);
                this.tblListaClientes.setItems(clientes);
                this.cuentas.remove(clienteModelo.getCuentaUnica());
                this.cuentas.add(cuenta);
                this.tblCuentaCliente.setItems(cuentas);
                UnibancoApplication.unibanco.getListaCuentas().remove(clienteModelo.getCuentaUnica());
                UnibancoApplication.unibanco.getListaClientes().remove(clienteModelo);

                UnibancoApplication.unibanco.setCliente(clienteAux);
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("La persona ya existe mi rey");
                alert.showAndWait();
            }
        }

    }

    @FXML
    void eliminarCliente(ActionEvent event) {

        ClienteModelo clienteModelo = this.tblListaClientes.getSelectionModel().getSelectedItem();
        this.clientes.remove(clienteModelo);
        this.cuentas.remove(clienteModelo.getCuentaUnica());
        UnibancoApplication.unibanco.getListaCuentas().remove(clienteModelo.getCuentaUnica());
        UnibancoApplication.unibanco.getListaClientes().remove(clienteModelo);

    }

    @FXML
    void seleccionarCliente(MouseEvent event) {

        ClienteModelo clienteModelo = this.tblListaClientes.getSelectionModel().getSelectedItem();
        CuentaModelo cuentaAsociada = clienteModelo.getCuentaUnica();

        this.txtNombre.setText(clienteModelo.getNombre());
        this.txtApellido.setText(clienteModelo.getApellido());
        this.txtEmail.setText(clienteModelo.getEmail());
        this.txtDireccion.setText(clienteModelo.getDireccion());
        this.txtCedula.setText(clienteModelo.getCedula());
        this.txtNumeroCuenta.setText(cuentaAsociada.getNumero());
        this.txtSaldoCuenta.setText(""+cuentaAsociada.getSaldo());
        this.txtTipoCuenta.setText(cuentaAsociada.getTipoCuenta());

    }

}
