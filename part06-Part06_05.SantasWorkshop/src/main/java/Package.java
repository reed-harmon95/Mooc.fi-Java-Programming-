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

public class Package {
    private ArrayList<Gift> gifts;
    
    public Package(){
        gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for(int i =0; i < gifts.size(); i++){
            totalWeight += gifts.get(i).getWeight();
        }
        
        return totalWeight;
    }
}
