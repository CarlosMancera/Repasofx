package co.edu.uniquindio.bancofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MainController {



    @FXML
    private Button btnIniciarSesionEmpleado;

    @FXML
    private Button btnRegistrarEmpleado;

    @FXML
    private TextField txtCedulaEmpleado;

    @FXML
    private TextField txtNombreEmpleado;

    @FXML
    void iniciarSesionEmpleado(ActionEvent event) throws IOException {

        ArrayList <EmpleadoModelo> listaEmpleados = new ArrayList<>();
        listaEmpleados = UnibancoApplication.unibanco.getListaEmpleados();

        for(EmpleadoModelo e: listaEmpleados){

            String nombreOriginal = e.getNombre();
            String cedulaOriginal = e.getCedula();

            if(nombreOriginal.equalsIgnoreCase(txtNombreEmpleado.getText()) && cedulaOriginal.equalsIgnoreCase(txtCedulaEmpleado.getText())){

                FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-empleado.fxml"));

                Scene scene = new Scene(loader.load());
                Stage stage = new Stage();
                stage.setTitle("Menu Empleado");
                stage.setScene(scene);

                MenuEmpleadoController controller = loader.getController();
                stage.show();
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error de credenciales");
                alert.setContentText("Verifique que el nombre y cédula son correctos");
                alert.showAndWait();
            }

        }

    }

    @FXML
    void registrarEmpleado(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-registrarEmpleado.fxml"));

        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu Registro");
        stage.setScene(scene);

        MenuRegistrarEmpleadoController controller = loader.getController();
        stage.show();

    }

}
