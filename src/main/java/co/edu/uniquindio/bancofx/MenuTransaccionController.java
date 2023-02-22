package co.edu.uniquindio.bancofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuTransaccionController implements Initializable {

    @FXML
    private Button btnListaTransacciones;

    @FXML
    private Button btnRealizarTransaccion;

    public void initialize(URL url, ResourceBundle rb){

    }

    @FXML
    void abrirListaTransacciones(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("lista-transacciones.fxml"));

        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Lista Transacciones");
        stage.setScene(scene);

        ListaTransaccionesController controller = loader.getController();
        stage.show();

    }

    @FXML
    void realizarTransaccion(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("transaccion.fxml"));

        Scene scene = new Scene(loader.load());
        Stage stage = new Stage();
        stage.setTitle("Realizar Transaccion");
        stage.setScene(scene);

        TransaccionController controller = loader.getController();
        stage.show();


    }

}
