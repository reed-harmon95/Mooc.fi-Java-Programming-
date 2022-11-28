
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int currValue = 0;
        int counter = 0;
        
        //open file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            //search file
            while (reader.hasNextLine()) {
                
                currValue = Integer.valueOf(reader.nextLine());
                
                
                //check if value is in range
                if(currValue <= upperBound && currValue >= lowerBound){
                    counter++;
                }
            }
            
            //output counter at end
            System.out.println("Numbers: " + counter);
          
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        
        
        
        
        
        
        //increment counter
    }

}
