import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> list;

    public Herd(){
        this.list=new ArrayList<>();
    }

    public String toString(){
        String s = "";
        for(Movable i : list){
            s+=i.toString()+"\n";
        }
        return s;
    }

    public void addToHerd(Movable movable){
        list.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable i : list)   {
            i.move(dx, dy);
        }
    }
    
}
