
import java.util.ArrayList;
import java.util.HashMap;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> register;
    
    public VehicleRegistry(){
        this.register = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (register.containsKey(licensePlate)){
           return false;
       }
        
        register.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        if (register.containsKey(licensePlate)){
            return this.register.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (register.containsKey(licensePlate)){
            this.register.remove(licensePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates(){
        for (LicensePlate key : register.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<String> strNoDup = new ArrayList<String>();
                  
        for (String value : register.values()){
                str.add(value);
        }
        
        for (int i = 0;i<str.size();i++){
            if (!(strNoDup.contains(str.get(i)))){
                strNoDup.add(str.get(i));
            }
        }
        
        for (int j = 0;j<strNoDup.size(); j++){
            System.out.println(strNoDup.get(j));
        }
        
    }
    
}
