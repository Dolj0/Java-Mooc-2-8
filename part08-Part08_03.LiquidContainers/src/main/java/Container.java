/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Container {
    int contains;
    
    public Container(){
        this.contains=0;
    }
    
    public int getWater(){
        return this.contains;
    }
    
    public void addWater(int water){
        if (this.contains + water > 100){
            this.contains = 100;
        } else if (water < 0){
            
        } else {
            this.contains = contains + water;
        }
    }
    
    public void removeWater(int water){
        if (this.contains - water < 0){
            this.contains = 0;
        } else if (water < 0){
            
        } else {
            this.contains = contains - water;
        }
        
    }
}
