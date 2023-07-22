import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(registry.containsKey(licensePlate)){
            return false;
        }else{
            registry.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate){
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(registry.containsKey(licensePlate)==true){
            registry.remove(licensePlate);
            return true;
        }else{
            return false;
        }
    }

    public void printLicensePlates(){
        for(LicensePlate lp : registry.keySet()){
            System.out.println(lp);
        }
    }

    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();
        for(String name : registry.values()){
            if(!names.contains(name)){
                names.add(name);
            }
        }
        
        for(String name:names){
            System.out.println(name);
        }
    }
}
