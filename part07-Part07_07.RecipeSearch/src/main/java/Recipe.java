
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reed
 */
public class Recipe {
    
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;
    
    
    public Recipe(String name, int cookTime) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList<>();
    }
    
    
    public void addIngredient(String ingredient){
        
        if(!ingredient.isEmpty()) {
            ingredients.add(ingredient);
        }
   
    }
    
    public int getCookTime(){
        return cookTime;
    }
    
    public String getName(){
        return name;
    }
    
    
    public String toString(){
        return name + ", cooking time: " + cookTime;
    }
    
    public ArrayList<String> getIngredients(){
        return ingredients;
    }
            
}
