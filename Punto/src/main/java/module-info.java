module PuntoVenta {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens PuntoVenta.Punto to javafx.fxml;
    exports PuntoVenta.Punto;
}