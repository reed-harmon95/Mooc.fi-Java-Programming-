
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give the first number:");
        String first = (scanner.nextLine());
        System.out.println("Give the second number:");
        String second = (scanner.nextLine());
        
        if(first.equals(second)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
