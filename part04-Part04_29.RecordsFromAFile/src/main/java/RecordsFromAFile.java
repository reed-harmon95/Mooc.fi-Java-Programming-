
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file, line, name, age;
        String[] lineParts = new String[2];
        
        
        //get the file name
        System.out.println("Name of the file: ");
        file = scanner.nextLine();
        
        

        try(Scanner reader = new Scanner(Paths.get(file))){
            
            
            //read in the data
            //format: name,age
            while(reader.hasNextLine()){
                line = reader.nextLine();
                
                
                //split the data by the comma
                lineParts = line.split(",");
                name = lineParts[0];
                age = lineParts[1];
                
                
                //output the data
                //format: name, "age:" age "years"
                if(age.equals("1")){
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        

        
    }
}
