package com.example.demo;

import java.io.IOException;

import org.springframework.stereotype.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
@Controller
public class FxControl {
     
    @FXML
    private Button addItem;
    
    @FXML
    private Label label; 
      
    @FXML
    private void onClick(ActionEvent event) {
    	Stage secondaryStage = new Stage();
    	FXMLLoader fxmlLoader = new FXMLLoader();
    	fxmlLoader.setLocation(getClass().getResource("/fxml/Item.fxml"));
        GridPane rootNode = new GridPane();
		try {
			rootNode = fxmlLoader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
               
        Scene scene = new Scene(rootNode, 300, 200);
        secondaryStage.setScene(scene);
        secondaryStage.show();
    }
}
