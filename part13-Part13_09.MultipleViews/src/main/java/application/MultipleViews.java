package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) {
  
        Button toFirst = new Button("To the first view!");
        Button toSecond = new Button("To the second view!");
        Button toThird = new Button("To the third view!");

  
        BorderPane layout1 = new BorderPane();
        Label label1 = new Label("First view!");
        layout1.setTop(label1);
        layout1.setCenter(toSecond);

        VBox layout2 = new VBox();
        layout2.setSpacing(10);
        Label label2 = new Label("Second view!");
        layout2.getChildren().add(toThird);
        layout2.getChildren().add(label2);

        GridPane layout3 = new GridPane();
        Label label3 = new Label("Third view!");
        layout3.add(label3,0,0);
        layout3.add(toFirst,1,1);

        Scene first = new Scene(layout1);
        Scene second = new Scene(layout2);
        Scene third = new Scene(layout3);

        toFirst.setOnAction((event) -> {
            window.setScene(first);
        });
  
        toSecond.setOnAction((event) -> {
            window.setScene(second);
        });
  
        toThird.setOnAction((event) -> {
            window.setScene(third);
        });
  
        window.setScene(first);
        window.show();
    }

}
