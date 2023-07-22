package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(ShanghaiApplication.class);
    }
    
    
    @Override
    public void start(Stage stage) throws Exception{
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2006,2018,1);
        NumberAxis yAxis = new NumberAxis(0,100,2);
        
        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanhai ranking");
        
        Map<Integer,Integer> data = new HashMap<>();
        data.put(2007, 73);
        data.put(2008, 68);
        data.put(2009, 72);
        data.put(2010, 72);
        data.put(2011, 74);
        data.put(2012, 73);
        data.put(2013, 76);
        data.put(2014, 73);
        data.put(2015, 67);
        data.put(2016, 56);
        data.put(2017, 56);
        
        // add the data set to the line chart
        XYChart.Series xyData = new XYChart.Series();
        data.entrySet().stream().forEach(pair -> {
        	xyData.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
        });
        lineChart.getData().add(xyData);
        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

}