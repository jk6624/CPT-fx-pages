package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * @author Jeshna Kanduri
 * @date 12/06/2024
 * Main method accesing the registration page upon running
 */
public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/view/RegisterFX.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		} catch(Exception e) {
		
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
