
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String first, last;
        String id;
        
        //get first name
        System.out.println("First name: ");
        first = scanner.nextLine();
        
        
        //while there is valid first name
        //do work
        while(!first.isEmpty()){
            
            //get last name and id
            System.out.println("Last name: ");
            last = scanner.nextLine();
            System.out.println("Identification number: ");
            id = scanner.nextLine();
            
            //put into Personal Info object
            PersonalInformation pInfo = new PersonalInformation(first, last, id);
            
            //add to collection
            infoCollection.add(pInfo);
            
            
            //ask for first name
            System.out.println("First name: ");
            first = scanner.nextLine();
            
        }
        
        
        //print out collection
        for(int i = 0; i < infoCollection.size(); i++){
            System.out.println(infoCollection.get(i).getFirstName() +
                    " " + infoCollection.get(i).getLastName());
        }
    }
}
