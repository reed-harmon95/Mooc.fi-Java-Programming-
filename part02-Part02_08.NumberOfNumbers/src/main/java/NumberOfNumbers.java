
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        int count = 0;
        
        
        System.out.println("Give a number:");
        int num = scanner.nextInt();
        while(num != 0) {
            count++;
            System.out.println("Give a number:");
            num = scanner.nextInt();
            
        }
        
        System.out.println("Number of numbers: " + count);
    }
}
