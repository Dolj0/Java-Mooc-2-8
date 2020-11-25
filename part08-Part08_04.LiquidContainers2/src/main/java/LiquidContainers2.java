
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        Container con1 = new Container();
        Container con2 = new Container();
        
        System.out.println("First: "+con1.contains()+"/100");
        System.out.println("Second: "+con2.contains()+"/100");
        
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
                if (con1.contains() + amount > 100){
                    con1.add(amount);
                } else if (amount < 0){
            
                } else {
                con1.add(amount);
                }
                
                System.out.println("First: "+con1.contains()+"/100");
                System.out.println("Second: "+con2.contains()+"/100");
            }
            
            if (command.equals("move")){
                
                if (con1.contains() - amount < 0){
                    int i = con1.contains();
                    con1.remove(amount);
                    con2.add(i);
                } else if ( amount < 0){

                } else {
                    con1.remove(amount);
                    con2.add(amount);

                }
                System.out.println("First: "+con1.contains()+"/100");
                System.out.println("Second: "+con2.contains()+"/100");
            }
            
            if (command.equals("remove")){
                con2.remove(amount);
                
                System.out.println("First: "+con1.contains()+"/100");
                System.out.println("Second: "+con2.contains()+"/100");
            }

        }
    }
}
        
        