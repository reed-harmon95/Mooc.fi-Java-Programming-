
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String string = scanner.nextLine();
        while(!string.isEmpty()){
            String[] arrayString = string.split(" ");
            
            for(String word : arrayString) {
                System.out.println(word);
            }
            
            string = scanner.nextLine();
        }
    }
}
