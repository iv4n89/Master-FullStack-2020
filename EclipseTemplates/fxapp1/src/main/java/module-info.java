module com.cloudftic.fxapp1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cloudftic.fxapp1 to javafx.fxml;
    exports com.cloudftic.fxapp1;
}