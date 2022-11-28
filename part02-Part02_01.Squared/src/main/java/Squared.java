
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = Integer.valueOf(scanner.nextLine());
        
        double result = Math.pow(first, 2);
        
        
        System.out.println((int)result);
    }
}
