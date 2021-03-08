module Unidad3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires java.desktop;
	requires java.prefs;
    opens Unidad3.Ejercicio4 to javafx.fxml;
    exports Unidad3.Ejercicio4;
}