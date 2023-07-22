package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private ArrayList<Sensor> list;
    private List<Integer> readings;

    public AverageSensor(){
        this.list = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor s) {
        list.add(s);
    }

    public List<Integer> readings(){
        return this.readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : list) {
            if(sensor.isOn()==false){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : list) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : list) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if(this.isOn()==true && this.list.size()>0){
            int sum=0;
            for (Sensor sensor : list) {
                sum+=sensor.read();
            }
            int average = (int) Math.floor(sum * 1.0 / list.size());
            this.readings.add(average);
            return average;
        }else{
            throw new IllegalStateException("Not all sensors are on");
        }
    }
    
}
