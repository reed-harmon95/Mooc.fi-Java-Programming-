
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         
        int sum = 0;
        int counter = 0;
        int num = 1;

        while(num != 0) {
            System.out.println("Give a number:");
            num = scanner.nextInt();
            
            if(num > 0){
                sum += num;
                counter++;
            }

        }
        
        if(counter > 0){
            System.out.println("Average of the numbers: " + ((double)sum/(double)counter));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
