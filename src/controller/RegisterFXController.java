package controller;


import java.io.IOException;

import data.CPTdatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author Jeshna Kanduri
 * @date 12/06/2024
 * Controller class for register page info and switch to login
 */
public class RegisterFXController {
	
	@FXML
	public TextField tfEmail; 
	@FXML
	public TextField tfUsername;
	@FXML
	public PasswordField pfPassword;
	@FXML
	public Label lblError;
	
	public void registerButtonPressed(ActionEvent event) throws IOException {
		
		//Get info from user to create account --> these values are stored in Dtabsae through Database.
		CPTdatabase.username = tfUsername.getText();
		CPTdatabase.password = pfPassword.getText();
		
	}
		 
	private Stage stage;
	private Scene scene;
	private Parent root;


	//Switching(Starting with) Register page
	public void switchToRegister(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/RegisterFX.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}


	//Switching from register to login page
	public void switchToLogin(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/view/LoginFX.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}




