package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean status;

    @Override
    public boolean isOn() {
        return status;
    }

    @Override
    public void setOn() {
        this.status=true;
    }

    @Override
    public void setOff() {
        this.status=false;
    }

    @Override
    public int read() {
        if(this.status==true){
            return new Random().nextInt(61)-30;
        }else{
            throw new IllegalStateException("Status is not on");
        } 
    }
    
}
