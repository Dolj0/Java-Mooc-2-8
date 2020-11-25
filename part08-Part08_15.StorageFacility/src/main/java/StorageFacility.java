
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage; 
    
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> storList = this.storage.get(unit);
        storList.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return storage.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        
        ArrayList<String> removeList = this.storage.get(storageUnit);
        removeList.remove(item);
        
        if (removeList.isEmpty()){
            storage.remove(storageUnit);
        }
        
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> storList = new ArrayList<String>();
        for (String unit : storage.keySet()){
            storList.add(unit);
        }
        return storList;
    }
    
}
