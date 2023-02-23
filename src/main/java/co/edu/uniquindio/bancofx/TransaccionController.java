package co.edu.uniquindio.bancofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TransaccionController {

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

    @FXML
    private TextField txtNumCuenta;


    @FXML
    void realizarTransaccion(ActionEvent event) {

        double valor = Double.parseDouble(this.txtValor.getText());
        String fecha = this.txtFecha.getText();
        String numeroCuenta = this.txtNumCuenta.getText();
        String tipoTransaccion = this.txtTipo.getText();
        String hora = this.txtHora.getText();
        TransaccionModelo transaccion;

        CuentaModelo cuenta = buscarCuenta(numeroCuenta);

        if(tipoTransaccion.equalsIgnoreCase("retiro")){

            if((cuenta.getSaldo()-valor)<0){
                transaccion = new TransRetiro(valor, hora, fecha);
                transaccion.setEstadoTransaccion("Rechazada");
                UnibancoApplication.unibanco.setTransaccion(transaccion);
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Saldo insuficiente para realizar la transacción");
                alert.showAndWait();



            } else if (cuenta.getSaldo()==0) {
                transaccion = new TransRetiro(valor, hora, fecha);
                transaccion.setEstadoTransaccion("Sin fondos");
                UnibancoApplication.unibanco.setTransaccion(transaccion);
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Sin fondos");
                alert.showAndWait();


            } else if ((cuenta.getSaldo()-valor)>0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("Información");
                alert.setContentText("Transacción Exitosa");
                alert.showAndWait();
                transaccion = new TransRetiro(valor, hora, fecha);
                UnibancoApplication.unibanco.setTransaccion(transaccion);
                transaccion.setEstadoTransaccion("Exitosa");
                cuenta.setSaldo(cuenta.getSaldo()-valor);
            }
        }

        if(tipoTransaccion.equalsIgnoreCase("deposito")) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Información");
            alert.setContentText("Transacción Exitosa");
            alert.showAndWait();
            transaccion = new TransDeposito(valor, hora, fecha);
            transaccion.setEstadoTransaccion("Exitosa");
            UnibancoApplication.unibanco.setTransaccion(transaccion);
            cuenta.setSaldo(cuenta.getSaldo() + valor);
        }

    }

    @FXML
    void consultarSaldo(ActionEvent event) {

        String hora = this.txtHora.getText();
        String fecha = this.txtFecha.getText();
        String numCuenta = this.txtNumCuenta.getText();
        CuentaModelo cuenta = buscarCuenta(numCuenta);
        TransaccionModelo transaccion;

        if(cuenta!=null) {
            String saldoActual = cuenta.getSaldo()+"";
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Información");
            alert.setContentText("Su saldo actual es: " + saldoActual);
            alert.showAndWait();
            transaccion = new TransaccionModelo(0, hora, fecha);
            transaccion.setTipoTransaccion("Consulta de Saldo");
            transaccion.setEstadoTransaccion("Exitosa");
            UnibancoApplication.unibanco.setTransaccion(transaccion);

        }else{

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Ese número de cuenta no existe mi rey");
            alert.showAndWait();
        }

    }

    CuentaModelo buscarCuenta(String numero){

        for(CuentaModelo c: UnibancoApplication.unibanco.getListaCuentas()){

            if(c.getNumero().equalsIgnoreCase(numero)){
                return c;
            }
        }

        return null;

    }

}
