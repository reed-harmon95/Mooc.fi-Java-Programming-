
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int oldest = 0;
        
        String string = scanner.nextLine();
        while(!string.isEmpty()) {
            
            
            String[] arrayString = string.split(",");
            
      
            if(oldest < Integer.valueOf(arrayString[1])){
                oldest = Integer.valueOf(arrayString[1]);
                name = arrayString[0];
            }
            
            string = scanner.nextLine();
            
            
        }
        
        System.out.println("Name of the oldest: " + name);
    }
    
}
