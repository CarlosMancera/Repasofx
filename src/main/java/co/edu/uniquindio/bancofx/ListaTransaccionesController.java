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

public class ListaTransaccionesController implements Initializable {

    @FXML
    private TableColumn<?, ?> colEstado;

    @FXML
    private TableColumn<?, ?> colFecha;

    @FXML
    private TableColumn<?, ?> colHora;

    @FXML
    private TableColumn<?, ?> colTipo;

    @FXML
    private TableColumn<?, ?> colValor;

    @FXML
    private TableView<TransaccionModelo> tblTablaTransacciones;

    ObservableList<TransaccionModelo> transacciones;

    public void initialize(URL url, ResourceBundle rb){

        transacciones = FXCollections.observableArrayList();

        this.colEstado.setCellValueFactory(new PropertyValueFactory<>("estadoTransaccion"));
        this.colFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        this.colTipo.setCellValueFactory(new PropertyValueFactory<>("tipoTransaccion"));
        this.colHora.setCellValueFactory(new PropertyValueFactory<>("hora"));
        this.colFecha.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        this.colValor.setCellValueFactory(new PropertyValueFactory<>("valor"));

        for (TransaccionModelo c : UnibancoApplication.unibanco.getListaTransacciones()) {
            this.transacciones.add(c);
            this.tblTablaTransacciones.setItems(transacciones);

        }

    }

}
