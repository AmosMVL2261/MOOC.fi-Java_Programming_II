package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    public void start(Stage window){
        VBox layout = new VBox();

        TextField textField = new TextField();
        Button update = new Button("Update");
        Label post = new Label("");

        update.setOnAction((event) -> {
            post.setText(textField.getText());
        });

        layout.getChildren().add(textField);
        layout.getChildren().add(update);
        layout.getChildren().add(post);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }
}
