/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reed
 */
public class Container {
    
    private int amount, capacity;
    
    public Container(){
        this.amount = 0;
        this.capacity = 100;
    }
    
    public int contains(){
        return amount;
    }
    
    public void add(int amount){
        if(amount > 0){
            this.amount += amount;
            if(this.amount >= capacity){
                this.amount = capacity;
            } 
        }

    }
    
    public void remove( int amount){
        if(amount > 0){
            this.amount -= amount;
            if(this.amount <= 0){
                this.amount = 0;
            }
        }

    }
    
    @Override
    public String toString(){
        return amount + "/" + capacity;
    }
}
