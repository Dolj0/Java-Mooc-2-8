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
        this.contains = 0;
    }
    
    public int contains(){
        return this.contains;
    }
    
    public void add (int amount){
        if (this.contains + amount > 100){
            this.contains = 100;
        } else if (amount < 0){
            
        } else {
            this.contains = contains + amount;
        }
    }
    
    public void remove(int amount){
        if (this.contains - amount < 0){
            this.contains = 0;
        } else if (amount < 0){
            
        } else {
            this.contains = contains - amount;
        }
    }
    
    public String toString(){
        return contains+"/100";
    }
    
}