/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.controller;

/**
 *
 * @author gee
 */
public class adequateResourceInventory {
    public double calculateadequateResourceInventory ( double item, double amount) {
     
        if (item <=0 || amount <=0) {
            return -1;
        }
            
            if (item >=10000 || amount >=10000) {
                return -1;
                        }
            
        double totalMult = item * amount;
        
        return totalMult;
    }
}


