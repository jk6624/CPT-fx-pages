package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * @author Jeshna Kanduri
 * @date 12/06/2024
 * Controller class for webview - webpage display only, no info
 */
public class WebviewFXController implements Initializable  {

	@FXML
	private WebView webview; 
	
	@FXML
	private TextField textField;
	
	private WebEngine engine; 
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//getting the webpage
		engine = webview.getEngine();
		loadPage();
		
	}
	
	public void loadPage() {
		//github overview page
		engine.load("https://github.com/jk6624");
		
	}

}
