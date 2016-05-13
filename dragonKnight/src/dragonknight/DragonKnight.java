/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonknight;

import byui.cit260.dragonknight.model.Player;

/**
 *
 * @author DragonmanJoel
 */
public class DragonKnight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Steve Rodgers");
        
        
        String playerInfo = playerOne.toString();
        System.out.println("playerInfo");
    }
    
}
