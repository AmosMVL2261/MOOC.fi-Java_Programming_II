
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility() {
        this.storageUnits = new HashMap<>();
    }

    public void add(String unit, String item) {
        storageUnits.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> storage = storageUnits.get(unit);
        storage.add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if(storageUnits.get(storageUnit)!=null){
            return storageUnits.get(storageUnit);
        }else{
            return new ArrayList<String>();
        }
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> listItems = new ArrayList<>();
        if (storageUnits.containsKey(storageUnit)) {
            for (String itemUnit : storageUnits.get(storageUnit)) {
                if (item.equals(itemUnit)) {
                    storageUnits.get(storageUnit).remove(itemUnit);
                    break;
                }
            }
            if (storageUnits.get(storageUnit).isEmpty()) {
                storageUnits.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> names = new ArrayList<>();
        for(String unit : storageUnits.keySet()){
            names.add(unit);
        }
        
        return names;
    }
}