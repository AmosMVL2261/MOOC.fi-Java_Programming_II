import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity){
        this.maxWeight=capacity;
        this.items=new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int weight=0;
        for(Item i : items){
            weight+=i.getWeight();
        }
        if(item.getWeight()+weight <=this.maxWeight){
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(items.contains(item)){
            return true;
        }
        return false;
    }
    
}
