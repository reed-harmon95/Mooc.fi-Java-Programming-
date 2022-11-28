
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int sum = 0;
        int counter = 0;
        int num = 1;

        while(num != 0) {
            System.out.println("Give a number:");
            num = scanner.nextInt();
            
            sum = sum + num;
            if(num != 0){
                counter++;
            }
        }
        
        System.out.println("Average of the numbers: " + ((double)sum/(double)counter));
    }
}
