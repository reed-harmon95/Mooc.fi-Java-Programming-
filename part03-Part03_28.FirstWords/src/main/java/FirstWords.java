
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        
        while(!string.isEmpty()){
            
            String[] arrayString = string.split(" ");
            
            System.out.println(arrayString[0]);
            
            string = scanner.nextLine();
            
        }
    }
}
