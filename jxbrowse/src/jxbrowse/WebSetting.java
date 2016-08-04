package jxbrowse;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebSetting extends Application {

	@FXML private WebView showbrowser = new WebView();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		   Parent root;
				try {
					root = (Parent)FXMLLoader.load(getClass().getClassLoader().getResource("fxml_example.fxml"));
					Scene scene = new Scene(root);
					WebEngine webEngine = showbrowser.getEngine();
			        // load the web page
			        webEngine.load("http://127.0.0.1:8080/");
			        //add the web view to the scene
					primaryStage.setTitle("FXML Welcome");
					primaryStage.setScene(scene);
					primaryStage.show();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		      
		    }
		
	

	 public static void main(String[] args){
	        launch(args);
	    }
}
