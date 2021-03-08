module Unidad3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires javafx.graphics;
    opens Unidad3.Terea3 to javafx.fxml;
    exports Unidad3.Terea3;
}