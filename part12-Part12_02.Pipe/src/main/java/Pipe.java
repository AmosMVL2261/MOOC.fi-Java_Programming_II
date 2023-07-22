import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> list;

    public Pipe(){
        this.list = new ArrayList<>();
    }

    public void putIntoPipe(T value){
        this.list.add(value);
    }
    
    public T takeFromPipe(){
        if(this.list.size()>0){
            T temp = this.list.get(0);
            this.list.remove(0);
            return temp;
        }
        return null;
    }
    
    public boolean isInPipe(){
        if(this.list.size()>0){
            return true;
        }
        return false;
    }
}
