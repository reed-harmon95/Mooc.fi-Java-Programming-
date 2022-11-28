
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GradesContainer grades = new GradesContainer();
        
        UserInterface userInterface = new UserInterface(scanner, grades);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        userInterface.start();
    }
}
