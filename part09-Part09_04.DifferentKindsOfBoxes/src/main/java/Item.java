
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Object object){
        if(object==null){
            return false;
        }
        if(this == object){
            return true;
        }
        if(!(object instanceof Item)){
            return false;
        }
        Item newItem = (Item) object;
        if(this.name==newItem.getName()){
            return true;
        }
    
        return false;
    }

    public int hashCode(){
        if(this.name!=null){
            return this.name.hashCode();
        }
        return this.name.hashCode() * this.weight;
    }
}
