module co.edu.uniquindio.bancofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.bancofx to javafx.fxml;
    exports co.edu.uniquindio.bancofx;
}