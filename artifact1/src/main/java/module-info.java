module group1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens group1.artifact1 to javafx.fxml;
    exports group1.artifact1;
}