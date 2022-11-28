
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        String name;
        int time;
        ArrayList<Recipe> recipesList = new ArrayList<>();
        
        
        
        
        //read file
        System.out.println("File to read: ");
        fileName = scanner.nextLine();
        
        
        try (Scanner fscan = new Scanner(Paths.get(fileName))) {

            
            //Sample recipe in list
            //Name
            //Cook time
            //Ingredients
            //Blank

            while (fscan.hasNextLine()) {
                //System.out.println("reading recipe");
                name = fscan.nextLine();
                time = Integer.valueOf(fscan.nextLine());
                
                //System.out.println("Recipe: " + name + " " + time);
                
                Recipe currRecipe = new Recipe(name, time);
                String ingredient = fscan.nextLine();
                
                
                //while there are ingredients to add to recipe
                while(!isBlankString(ingredient) && fscan.hasNextLine()){
                    //System.out.println("reading ingredient: " + ingredient);
                    currRecipe.addIngredient(ingredient);
                    ingredient = fscan.nextLine();
                }
                
                
                //at end of recipe, add to list of reecipes
                //System.out.println("Adding recipe to list");
                recipesList.add(currRecipe);
            }
            
            fscan.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
        
        //prompt for commands
        //list, stop, find name, find cooking time
        System.out.println("Commands:");
        System.out.print("list - lists the recipes \n"
                + "stop - stops the program \n"
                + "find name - searches recipes by name \n"
                + "find cooking time - searches recipes by cooking time \n"
                + "find ingredient - searches recipes by ingredient\n\n");
        System.out.println("Enter Commad: ");
        String command = scanner.nextLine();
        
        
        //while the command is not stop
        while(!command.equals("stop")){
            
            if(command.equals("list")){
                System.out.println("Recipes:");
                for(int i = 0; i < recipesList.size(); i++){
                    System.out.println(recipesList.get(i).toString());
                    
                }
            } else if(command.equals("find name")){
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                
                for(int i = 0; i < recipesList.size(); i++){
                    if(recipesList.get(i).getName().contains(word)){
                        System.out.println(recipesList.get(i).toString());
                    }
                }
            } else if(command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int searchTime = Integer.valueOf(scanner.nextLine());
                
                for(int i = 0; i < recipesList.size(); i++){
                    if(recipesList.get(i).getCookTime() <= searchTime){
                        System.out.println(recipesList.get(i).toString());
                    }
                }
            } else if( command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scanner.nextLine();
                ArrayList<String> ingredientsList;
                
                for(int i = 0; i < recipesList.size(); i++){
                   ingredientsList = new ArrayList<>(recipesList.get(i).getIngredients());
                   
                   for(int j = 0; j < ingredientsList.size(); j++){
                       if(ingredientsList.get(j).equals(ingredient)){
                           System.out.println(recipesList.get(i).toString());
                           break;
                       }
                   }
                }
            }
            
            
            
            System.out.println("Enter Commad: ");
            command = scanner.nextLine();
            
        }
        
    }
    
    
    public static boolean isBlankString(String string) {
    return string == null || string.trim().isEmpty();
}
    
    

}
