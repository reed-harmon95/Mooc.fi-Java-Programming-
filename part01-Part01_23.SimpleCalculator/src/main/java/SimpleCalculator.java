
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        
        //Sum
        System.out.println(first + " + " + second + " = " + (first + second));
        
        //difference
        System.out.println(first + " - " + second + " = " + (first - second));

        //product
        System.out.println(first + " * " + second + " = " + (first * second));

        //quotient
        System.out.println(first + " / " + second + " = " + (Double.valueOf(first) / Double.valueOf(second)));

        
    }
}
