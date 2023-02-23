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

public class MenuRegistrarEmpleadoController implements Initializable {

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private TableColumn<?, ?> colCedula;

    @FXML
    private TableColumn<?, ?> colCodigo;

    @FXML
    private TableColumn<?, ?> colNombre;

    @FXML
    private TableView<EmpleadoModelo> tblListaEmpleados;

    @FXML
    private TextField txtCedulaEmpleado;

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombreEmpleado;

    private ObservableList<EmpleadoModelo> empleados;

    public void initialize(URL url, ResourceBundle rb){
        empleados = FXCollections.observableArrayList();

        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colCedula.setCellValueFactory(new PropertyValueFactory<>("cedula"));

        for(EmpleadoModelo e: UnibancoApplication.unibanco.getListaEmpleados()){
            this.empleados.add(e);
            this.tblListaEmpleados.setItems(empleados);

        }
    }

    @FXML
    void registrarNuevoEmpleado(ActionEvent event) {

        String nombre = this.txtNombreEmpleado.getText();
        String codigo = this.txtCodigo.getText();
        String cedula = this.txtCedulaEmpleado.getText();

        EmpleadoModelo e = new EmpleadoModelo(nombre, cedula, codigo);
        UnibancoApplication.unibanco.setEmpleado(e);

        this.empleados.add(e);
        this.tblListaEmpleados.setItems(empleados);

    }

}
