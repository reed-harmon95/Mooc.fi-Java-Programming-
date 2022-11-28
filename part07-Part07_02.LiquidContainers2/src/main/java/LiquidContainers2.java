
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            
            //get the input and split it to get command and amount
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());

            
            //commands
            if(command.equals("add")){
                container1.add(amount);
            }
            if(command.equals("move")){
                if(container1.contains() < amount){
                    container2.add(container1.contains());
                    container1.remove(amount);
                } else {
                    container1.remove(amount);
                    container2.add(amount);
                }
     
            }
            if(command.equals("remove")){
                container2.remove(amount);
            }

        }
        
            System.out.println("First: " + container1.toString());
            System.out.println("Second: " + container2.toString());
    }

}
