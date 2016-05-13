/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonknight;

import byui.cit260.dragonknight.model.Item;
import byui.cit260.dragonknight.model.Player;

/**
 *
 * @author DragonmanJoel
 */
public class DragonKnight {

    private static Object itemone;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Steve Rodgers");
        
        
        String playerInfo = playerOne.toString();
        System.out.println("playerInfo");
        
        
        Item itemOne = new Item();
        
        itemOne.setName("potion");
        itemOne.setDescription("Heals 100 HP");
        itemOne.setCost("10 gold");
        
        String itemInfo = itemOne.toString();
        System.out.println("itemInfo");
    }
    
}
