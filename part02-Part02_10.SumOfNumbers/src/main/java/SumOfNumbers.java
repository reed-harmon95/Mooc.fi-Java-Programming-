
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int sum = 0;
        int num = 1;

        while(num != 0) {
            System.out.println("Give a number:");
            num = scanner.nextInt();
            
            sum = sum + num;
        }
        
        System.out.println("Sum of the numbers: " + sum);
    }
}
