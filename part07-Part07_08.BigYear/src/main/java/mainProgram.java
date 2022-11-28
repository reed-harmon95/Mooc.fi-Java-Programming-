
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        String command;
        ArrayList<Bird> birdList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        
        //prompt commands
        //commands: add, observation, all, one, quit
        System.out.println("?");
        command = scan.nextLine();
        
        while(!command.equals("Quit")){
            
            
            if(command.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latin = scan.nextLine();
                Bird newBird = new Bird(name, latin);
                birdList.add(newBird);
                
            } else if(command.equals("Observation")) {
                boolean obsAdded = false;
                
                
                System.out.println("Bird?");
                String birdName = scan.nextLine();
                for(int i = 0; i < birdList.size(); i++){
                    if(birdList.get(i).getName().equals(birdName)){
                        birdList.get(i).addObservation();
                        obsAdded = true;
                    }
                }
                
                
                if(obsAdded == false){
                    System.out.println("Not a bird!");
                }
                
                obsAdded = false;
            } else if(command.equals("All")){
                for(int i = 0; i < birdList.size(); i++){
                    System.out.println(birdList.get(i).toString());
                }
            } else if(command.equals("One")) {
                System.out.println("Bird?");
                String birdName = scan.nextLine();
                for(int i = 0; i < birdList.size(); i++) {
                    if(birdList.get(i).getName().equals(birdName)){
                        System.out.println(birdList.get(i).toString());
                    }
                }
            }
            
            
            System.out.println("?");
            command = scan.nextLine();
        }

    }

}
