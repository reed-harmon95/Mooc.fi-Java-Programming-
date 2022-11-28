
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int count = 0;
        int num = 1;

        while(num != 0) {
            System.out.println("Give a number:");
            num = scanner.nextInt();
            if(num < 0){
                count++;
            }
        }
        
        System.out.println("Number of negative numbers: " + count);
    }
}
