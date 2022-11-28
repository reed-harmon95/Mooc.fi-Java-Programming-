
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        
        System.out.println("What file should have its contents printed? ");
        fileName = scanner.nextLine();
        
        try (Scanner contents = new Scanner(Paths.get(fileName))) {

            // we read the file until all lines have been read
            while (contents.hasNextLine()) {
                // we read one line
                String row = contents.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
