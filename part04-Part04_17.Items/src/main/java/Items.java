
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String name;
        
        System.out.println("Name: ");
        name = scanner.nextLine();
        
        while(!name.isEmpty()){
            items.add(new Item(name));
            
            
            
            
            System.out.println("Name: ");
            name = scanner.nextLine();
        }
        
        for (Item item: items){
            System.out.println(item);
        }
        
    }
}
