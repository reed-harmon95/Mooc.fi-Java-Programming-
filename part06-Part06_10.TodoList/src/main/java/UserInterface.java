
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
public class UserInterface {
    
    private Scanner scan;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scan = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        
        String command, task;
        int removed;
        
        while(true){
            
            System.out.println("Command:");
            command = scan.nextLine();
            
            
            if(command.equals("stop")){
                break;
            } else if(command.equals("add")){
                System.out.println("To add:");
                task = scan.nextLine();
                todoList.add(task);
            } else if(command.equals("list")) {
                todoList.print();
            } else if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                removed = scan.nextInt();
                todoList.remove(removed);
            }
        }
    }
}
