package co.edu.uniquindio.bancofx;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuCuentasBancariasController {

    @FXML
    private TableColumn<?, ?> colNumero;

    @FXML
    private TableColumn<?, ?> colSaldo;

    @FXML
    private TableColumn<?, ?> colTipoCuenta;

    @FXML
    private TableView<CuentaModelo> tblTablaCuentas;

    public void initialize(URL url, ResourceBundle rb){



    }

}
