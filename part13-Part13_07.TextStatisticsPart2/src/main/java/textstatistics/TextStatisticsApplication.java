package textstatistics;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application{

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    
    @Override
    public void start(Stage stage) {
        TextArea text = new TextArea();
        BorderPane layout = new BorderPane();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest2 = new Label("The longest word is: ");
        HBox statistics = new HBox();
        
        text.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            
           
            letters.setText("Letters: " + String.valueOf(characters));
            words.setText("Words: " + String.valueOf(parts.length));
            longest2.setText("The longest word is: " + longest);
            
        });
        
        statistics.setSpacing(10);
        statistics.getChildren().addAll(letters, words, longest2);
        layout.setCenter(text);
        layout.setBottom(statistics);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();
        
    }

}
