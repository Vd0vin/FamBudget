package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class FamBudgetApplication extends Application{
	private ConfigurableApplicationContext springContext;
    private Parent rootNode;
    private FXMLLoader fxmlLoader;

    public static void main(String[] args) {
		launch(args);
	}
    
    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(FamBudgetApplication.class);
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(springContext::getBean);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        fxmlLoader.setLocation(getClass().getResource("/fxml/View.fxml"));
        rootNode = fxmlLoader.load();
        
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(rootNode, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();      
    }

}

