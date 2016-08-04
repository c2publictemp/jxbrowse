package jxbrowse;

import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebBrowser extends Region {
	final WebView browser = new WebView();
    final WebEngine webEngine = browser.getEngine();
	 public WebBrowser() {
	        //apply the styles
	        getStyleClass().add("browser");
	        // load the web page
	        webEngine.load("http://127.0.0.1:8080/");
	        //add the web view to the scene
	        getChildren().add(browser);
	 
	    }
}
