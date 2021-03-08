module Unidad3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
	requires javafx.graphics;
    opens Unidad3.EditorText to javafx.fxml;
    exports Unidad3.EditorText;
}