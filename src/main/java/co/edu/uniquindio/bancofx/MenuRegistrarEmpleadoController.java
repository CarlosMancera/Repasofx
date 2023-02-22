package co.edu.uniquindio.bancofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MenuRegistrarEmpleadoController {

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private TableColumn<?, ?> colApellido;

    @FXML
    private TableColumn<?, ?> colCedula;

    @FXML
    private TableColumn<?, ?> colDireccion;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableView<?> tblListaEmpleados;

    @FXML
    private TextField txtApellidoEmpleado;

    @FXML
    private TextField txtCedulaEmpleado;

    @FXML
    private TextField txtDireccionEmpleado;

    @FXML
    private TextField txtEmailEmpleado;

    @FXML
    private TextField txtNombreEmpleado;

    @FXML
    void registrarNuevoEmpleado(ActionEvent event) {

    }

}
