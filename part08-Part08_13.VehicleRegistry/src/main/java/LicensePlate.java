
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public String getLiNumber(){
        return this.liNumber;
    }

    public String getCountry(){
        return this.country;
    }

    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(!(object instanceof LicensePlate)){
            return false;
        }
        LicensePlate lp = (LicensePlate) object;
        if(
            this.country == lp.getCountry() &&
            this.liNumber == lp.getLiNumber()
        ){
            return true;
        }
        return false;
    }

    public int hashCode(){
        if(this.liNumber!=null){
            return this.liNumber.hashCode();
        }
        else{
            return this.country.hashCode();
        }
    }

}
