/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.controller;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gee
 */
public class adequateResourceInventoryTest {
    
    public adequateResourceInventoryTest() {
    }
    
}
/** Test of calculateadequateResourceInventory method, of class ManufacturingController.
 * 
 */
@Test
public void testCalculateadequateResourceInventory(){
 System.out.println("calculateadequateResourceInventory");
 
 double amount = -6.0;
 double item = 5.0;
 adequateResourceInventory instance = new ManufacturingControl();
 double expResult =-1;
 double result = instance.calculateadequateResourceInventory (item,amount);
assertEquals (expResult, result, 0.01);


System.out.println("calculateadequateResourceInventory");
amount = -10.0;
 item = 9.0;
 expResult =-1;
 result = instance.calculateadequateResourceInventory (item,amount);
assertEquals (expResult, result, 0.01);


System.out.println("calculateadequateResourceInventory");
 amount = 50.0;
 item = 10.0;
 expResult =500.0;
 result = instance.calculateadequateResourceInventory (item,amount);
assertEquals (expResult, result, 0.01);
}