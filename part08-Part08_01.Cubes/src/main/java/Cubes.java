
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            String input = scanner.nextLine();
            
            if (input.equals("end")){
                break;
            } else {
                int i = Integer.valueOf(input);
                int j = (int)(Math.pow(i, 3));
                System.out.println(j);
            }
        }
    }
}
