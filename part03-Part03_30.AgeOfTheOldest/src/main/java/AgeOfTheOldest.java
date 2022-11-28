
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        
        String string = scanner.nextLine();
        while(!string.isEmpty()) {
            
            
            String[] arrayString = string.split(",");
            
      
            if(oldest < Integer.valueOf(arrayString[1])){
                oldest = Integer.valueOf(arrayString[1]);
            }
            
            string = scanner.nextLine();
            
            
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
