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
public class ManufacturingControl {
    
    public double calculateManufactureSpell (double resource, double amount, double item) {
     
        if (resource <= 0 || amount <=0 || item <=0) {
            return -1;
        }
            
        double totalMult = resource * amount * item;
        
        return totalMult;
    }
}
