import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> box;
    private double maximumCapacity;

    public Box(double maximumCapacity){
        this.box=new ArrayList<>();
        this.maximumCapacity=maximumCapacity;
    }

    public void add(Packable item){
        if(item.weight()+weight()<=maximumCapacity){
            this.box.add(item);
        }
    }

    public String toString(){
        return "Box: "+box.size()+" items, total weight "+weight()+" kg";
    }

    public double weight(){
        double total = 0;
        for(Packable i : box){
            total+=i.weight();
        }
        return total;
    }
}
