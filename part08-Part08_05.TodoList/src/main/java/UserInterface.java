
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class UserInterface {
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list,Scanner scan){
        this.list = list;
        this.scan = scan;
    }
    
    public void start(){
        
        while (true){
            System.out.print("Command: ");
            String command = scan.nextLine();
            
            if (command.equals("stop")){
                break;
            }
            
            if (command.equals("add")){
                System.out.print("To add: ");
                String toAdd = scan.nextLine();
                list.add(toAdd);
            }
            
            if (command.equals("list")){
                list.print();
            }
            
            if (command.equals("remove")){ 
                System.out.print("Which one is removed?"); 
                int toRemove = Integer.valueOf(scan.nextLine());
                list.remove(toRemove);
            }
        }
    }
    
    
}
