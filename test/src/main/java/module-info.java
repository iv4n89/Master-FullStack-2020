module PuntoVenta {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens PuntoVenta.Test to javafx.fxml;
    exports PuntoVenta.Test;
}