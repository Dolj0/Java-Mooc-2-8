
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while (true){
            int i = Integer.valueOf(scanner.nextLine());
            
            if (i < 0){
                continue;
            } else if (i == 0){
                break;
            } else {
                list.add(i);
            }
        }
        
        int sum = 0;
        
        for (int i = 0; i<list.size(); i++){
            sum = sum + list.get(i);
        }
        
        if (sum==0){
            System.out.println("Cannot calculate the average");
        } else {
            double k = ((1.0*sum)/list.size());
            System.out.println(k);
        }
    }
}
