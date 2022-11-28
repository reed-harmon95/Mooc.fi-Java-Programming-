
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int num = 1;
        int sum = 0;
        int numCount = 0;
        
        while(num != 0){
            System.out.println("Give a number:");
            num = scanner.nextInt();
            
            if(num != 0){
                sum += num;
                numCount++;
            }
        }
        
        System.out.println("Number of numbers: " + numCount);
        System.out.println("Sum of the numbers: " + sum);

    }
}
