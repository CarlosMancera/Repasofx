package co.edu.uniquindio.bancofx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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

    }

    @FXML
    void editarCliente(ActionEvent event) {

    }

    @FXML
    void eliminarCliente(ActionEvent event) {

    }

}
