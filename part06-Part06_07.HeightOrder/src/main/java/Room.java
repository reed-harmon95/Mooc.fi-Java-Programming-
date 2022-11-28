/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reed
 */
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> peopleInRoom;
    
    
    public Room() {
        peopleInRoom = new ArrayList<>();
    }
    
    public void add(Person person) {
        peopleInRoom.add(person);
    }
    
    public boolean isEmpty() {
        return peopleInRoom.isEmpty();
    }
    
    
    public ArrayList<Person> getPersons() {
        return peopleInRoom;
    }
    
    public Person shortest(){
        
        if(peopleInRoom.isEmpty()){
            return null;
        }
        
        
        //set shortest to first person in room
        Person shortest = this.peopleInRoom.get(0);
        
        
        //iterate through room and compare heights
        for(int i = 0; i < peopleInRoom.size(); i++){
            
            if(peopleInRoom.get(i).getHeight() < shortest.getHeight()){
                shortest = peopleInRoom.get(i);
            }
        }
        
        return shortest;  
    }
    
    public Person take() {
        Person shortest = shortest();
        
        if(peopleInRoom.isEmpty()){
            return null;
        }
        
        peopleInRoom.remove(shortest);
        
        return shortest;
    }
    
}
