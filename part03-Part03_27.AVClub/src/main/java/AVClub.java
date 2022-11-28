
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        while(!string.isEmpty()){
            
            String[] arrayString = string.split(" ");
            
            for(int i = 0; i < arrayString.length; i++){
                if(arrayString[i].contains("av")) {
                    System.out.println(arrayString[i]);
                }
                    
            }
            
            string = scanner.nextLine();
        }

    }
}
