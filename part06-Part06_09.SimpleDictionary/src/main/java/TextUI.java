
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reed
 */
public class TextUI {
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;
    
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary){
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start(){
        
        String command, word, translation;
        
        
        
        //ask for command
        while(true){
            
            System.out.println("Command:");
            command = scanner.nextLine();
            
            
            //if end, print "Bye bye!"
            //exit start
            if(command.equals("end")){
                
                
                System.out.println("Bye bye!");
                break;
                
                
            //if add, prompt word and translation
            } else if(command.equals("add")){
                
                
                System.out.println("Word:");
                word = scanner.nextLine();
                System.out.println("Translation:");
                translation = scanner.nextLine();
                
                
                //add to dictionary
                simpleDictionary.add(word, translation);
                
                
            //if search, prompt for word to be translated
            } else if(command.equals("search")){
                
                
                System.out.println("To be translated:");
                word = scanner.nextLine();
                
                translation = simpleDictionary.translate(word);
                if(translation == null){
                    System.out.println("Word " + word + " was not found.");
                    
                } else {
                    System.out.println("Translation: " + translation);
                }
               
                
            //otherwise, print "Unknown command"
            } else {
                System.out.println("Unkown command");
                continue;   //optional
            }
            
        }
        

        
        
        
    }
    
    
}
