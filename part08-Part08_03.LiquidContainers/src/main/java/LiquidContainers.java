
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container con1 = new Container();
        Container con2 = new Container();
        
        System.out.println("First: "+con1.getWater()+"/100");
        System.out.println("Second: "+con2.getWater()+"/100");
        
        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();
            
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                if (con1.getWater() + amount > 100){
                    con1.addWater(amount);
                } else if (amount < 0){
            
                } else {
                con1.addWater(amount);
                }
                
                System.out.println("First: "+con1.getWater()+"/100");
                System.out.println("Second: "+con2.getWater()+"/100");
            }
            
            if (command.equals("move")){
                
                if (con1.getWater() - amount < 0){
                    int i = con1.getWater();
                    con1.removeWater(amount);
                    con2.addWater(i);
                } else if ( amount < 0){

                } else {
                    con1.removeWater(amount);
                    con2.addWater(amount);

                }
                System.out.println("First: "+con1.getWater()+"/100");
                System.out.println("Second: "+con2.getWater()+"/100");
            }
            
            if (command.equals("remove")){
                con2.removeWater(amount);
                
                System.out.println("First: "+con1.getWater()+"/100");
                System.out.println("Second: "+con2.getWater()+"/100");
            }

        }
    }

}
