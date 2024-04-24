module co.uniquindio.preparcial2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.preparcial2 to javafx.fxml;
    exports co.uniquindio.preparcial2;
}
