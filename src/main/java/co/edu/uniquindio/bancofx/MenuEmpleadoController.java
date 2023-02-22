package co.edu.uniquindio.bancofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuEmpleadoController {

    @FXML
    private Button btnListaCuentas;

    @FXML
    private Button btnMenuClientes;

    @FXML
    private Button btnMenuTransacciones;

    @FXML
    void abrirListaCuentas(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-cuentasBancarias.fxml"));

        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Cuentas Bancarias");
        stage.setScene(scene);

        MenuCuentasBancariasController controller = loader.getController();
        stage.show();

    }

    @FXML
    void abrirMenuClientes(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-cliente.fxml"));

        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu Cliente");
        stage.setScene(scene);

        MenuClienteController controller = loader.getController();
        stage.show();

    }

    @FXML
    void abrirTransacciones(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-transaccion.fxml"));

        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu Transacciones");
        stage.setScene(scene);

        MenuTransaccionController controller = loader.getController();
        stage.show();

    }

}
