
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int first = Integer.valueOf(scanner.nextLine());
        
        if(first < 0){
            first = first * -1;
        }
        
        System.out.println(first);
    }
}
