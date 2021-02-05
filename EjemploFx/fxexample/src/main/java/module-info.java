module com.cloudftic.fxexample {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.base;

    opens com.cloudftic.fxexample to javafx.fxml;
    opens com.cloudftic.fxexample.data to javafx.fxml;
    exports com.cloudftic.fxexample;
}