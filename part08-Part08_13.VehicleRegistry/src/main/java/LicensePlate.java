
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
    
    public String getLiNumber(){
        return this.liNumber;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    @Override
    public String toString() {
        return country + " " + liNumber;
    }
    
     public boolean equals(Object object){
        if (this == object){
            return true;
        }
        
        if (!(object instanceof LicensePlate)){
            return false;
        }
       
        
        if(this.toString().equals(object.toString())){
            return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode(){
        if (this.toString() == null){
            return 0;
        }
        
        return this.toString().hashCode();
    }
}
    
  
