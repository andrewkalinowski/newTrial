/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonknight;

import byui.cit260.dragonknight.model.Game;
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
        playerOne.setClassSelection("Avenger");
        playerOne.setAttributes("Super Soldier");
        playerOne.setRace("white");
        
        String playerInfo = playerOne.toString();
        System.out.println("playerInfo");
 
        
        Game gameOne = new Game();
        
        gameOne.setMenu("M = Map");
        gameOne.setSpell("Fire");
        gameOne.setPlayerLevel(13);
        gameOne.setHitPoints(1000);
        
        String gameInfo = gameOne.toString();
        System.out.println("gameInfo");
        
        
        Item itemOne = new Item();
        
        itemOne.setName("potion");
        itemOne.setDescription("Heals 100 HP");
        itemOne.setCost("10 gold");
        
        String itemInfo = itemOne.toString();
        System.out.println("itemInfo");
    }
    
}
