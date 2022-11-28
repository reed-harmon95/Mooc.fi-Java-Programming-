import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String name;
        int duration, maxDuration;
        
        //get name
        System.out.println("Name: ");
        name = scanner.nextLine();
        
        
        //while there is valid name
        //do work
        while(!name.isEmpty()){
            
            //get duration
            System.out.println("Duration: ");
            duration = Integer.valueOf(scanner.nextLine());

            
            //put into tp object
            TelevisionProgram tv = new TelevisionProgram(name, duration);
            
            //add to collection
            programs.add(tv);
            
            
            //ask for name
            System.out.println("Name: ");
            name = scanner.nextLine();
            
        }
        
        
        //ask for max duration
        System.out.println("Program's maximum duration? ");
        maxDuration = scanner.nextInt();
        
        
        //print out collection
        for(int i = 0; i < programs.size(); i++){
            
            if(programs.get(i).getDuration() <= maxDuration){
                System.out.println(programs.get(i).getName() +
                    ", " + programs.get(i).getDuration() + " minutes");
            }
            
        }
    }
}
