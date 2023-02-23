package co.edu.uniquindio.bancofx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuCuentasBancariasController implements Initializable {

    @FXML
    private TableColumn<?, ?> colNumero;

    @FXML
    private TableColumn<?, ?> colSaldo;

    @FXML
    private TableColumn<?, ?> colTipoCuenta;

    @FXML
    private TableView<CuentaModelo> tblTablaCuentas;

    ObservableList<CuentaModelo> cuentas;

    public void initialize(URL url, ResourceBundle rb){


        cuentas = FXCollections.observableArrayList();

        this.colNumero.setCellValueFactory(new PropertyValueFactory<>("numero"));
        this.colSaldo.setCellValueFactory(new PropertyValueFactory<>("saldo"));
        this.colTipoCuenta.setCellValueFactory(new PropertyValueFactory<>("tipoCuenta"));

        for (CuentaModelo c : UnibancoApplication.unibanco.getListaCuentas()) {
            this.cuentas.add(c);
            this.tblTablaCuentas.setItems(cuentas);

        }



    }

}
