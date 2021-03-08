package Unidad3.EditorText;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EditorApp extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		FXMLLoader loader=new FXMLLoader(getClass().getResource("ui.fxml"));
		loader.setControllerFactory(t->new EditorController(new EditorModel()));
		
		stage.setScene(new Scene(loader.load()));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
