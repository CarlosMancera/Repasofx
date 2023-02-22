package co.edu.uniquindio.bancofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class MenuClienteController {

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
    private AnchorPane tablaPersonas;

    @FXML
    private TableView<?> tblListaClientes;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCuenta;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

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
