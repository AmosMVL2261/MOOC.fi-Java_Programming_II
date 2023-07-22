import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history=new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.removeAll(history);
    }

    public String toString(){
        return this.history.toString();
    }

    public double maxValue(){
        double max = this.history.get(0);
        if (this.history.size() > 0){
            for (Double amount : this.history) {
                if (amount > max) {
                    max = amount;
                }
            }
        }
        return max;
    }

    public double minValue(){
        double min = this.history.get(0);
        if (this.history.size() > 0) {
            for (Double amount : this.history) {
                if (amount < min) {
                    min = amount;
                }
            }
        }
        return min;
    }

    public double average(){
        if(this.history.size()==0){
            return 0;
        }
        double sum = 0;
        for(double i : this.history){
            sum+=i;
        }
        return sum * 1.0 / this.history.size();
    }
}
