package co.edu.uniquindio.bancofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TransaccionController implements Initializable {

    @FXML
    private Button btnRealizarTransaccion;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtHora;

    @FXML
    private TextField txtTipo;

    @FXML
    private TextField txtValor;

    public void initialize(URL url, ResourceBundle rb){

    }

    @FXML
    void realizarTransaccion(ActionEvent event) {

    }

}
