package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //Axis limits
        NumberAxis xAxis = new NumberAxis(1967, 2009, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        //All line charts
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        Map<String, Map<Integer, Double>> values = read();
        values.keySet().stream().forEach(party -> {
            //New set of data
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            //Fill the data info
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            
            lineChart.getData().add(data);
        });
        
        Scene view = new Scene(lineChart, 640,480);
        stage.setScene(view);
        stage.show();
    }

    public Map<String, Map<Integer, Double>> read() throws IOException {
        //Get the lines of the file
        ArrayList<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        //The first line is the columns head
        String[] years = lines.get(0).split("\t");
        lines.remove(0);
        //All data hashmap: title - HashMap that contains years info
        Map<String, Map<Integer, Double>> allData = new HashMap<>();
        for (String line : lines) {
            //HashMap that contains years info
            Map<Integer, Double> data = new HashMap<>();
            String[] pieces = line.split("\t");
            for (int i = 1; i < years.length; i++) {
                //If there's no data continue
                if (pieces[i].equals("-")) {
                    continue;
                }
                //Add year - value
                data.put(Integer.valueOf(years[i]), Double.valueOf(pieces[i]));
            }
            allData.put(pieces[0], data);
        }

        return allData;
    }
}