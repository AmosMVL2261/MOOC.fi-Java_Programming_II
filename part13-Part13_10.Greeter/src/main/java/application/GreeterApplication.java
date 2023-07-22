package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    public static void main(String[] args) {
        //System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) {
        // 1. Creating the view
        // 1.1 Creating components to be used
        Label greeting = new Label("Enter your name");
        TextField input = new TextField();
        Button start = new Button("Start");
        
        //1.2 Set and style layout
        GridPane layout = new GridPane();
        layout.add(greeting, 0, 0);
        layout.add(input, 0, 1);
        layout.add(start, 0, 2);
        
        // 1.3 styling the layout
        layout.setPrefSize(300, 180);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20,20,20,20));
        
        // 1.4 creating the view itself and setting it to use the layout
        Scene firstView = new Scene(layout);
        
        // 2 Creating a view for showing the welcome message
        Label welcome = new Label("");
        
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(welcome);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene secondView = new Scene(welcomeLayout);
        
        // 3 Adding an event handler to the start button
        start.setOnAction((event)->{
            welcome.setText("Welcome "+input.getText()+"!");
            window.setScene(secondView);
        });
        
        window.setScene(firstView);
        window.show();
    }
}