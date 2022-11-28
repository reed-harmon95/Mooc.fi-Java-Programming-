
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        
        //convert days to hours
        int hours = days * 24;
        
        //convert hours to minutes
        int minutes = hours * 60;
        
        //convert minutes to seconds
        int seconds = minutes * 60;
        
        System.out.println(seconds);
    }
}
