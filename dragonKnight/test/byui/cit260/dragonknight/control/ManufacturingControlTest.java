/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.dragonknight.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DragonmanJoel
 */
public class ManufacturingControlTest {
    
    public ManufacturingControlTest() {
    }

    /**
     * Test of adequateResourceInventory method, of class ManufacturingControl.
     */
    @Test
    public void testAdequateResourceInventory() {
        System.out.println("/tTest case #1");
        double item = 10.0;
        double amount = 5.0;
        ManufacturingControl instance = new ManufacturingControl();
        double expResult = 5.0;
        double result = instance.adequateResourceInventory(item, amount);
        assertEquals(expResult, result, 0.0001);
        
        
        /* Test case #2*/
        
        System.out.println("/tTest case #2");
        // Input values for test case 2
        item = -10.0;
        amount = 15.0;
        expResult = -1;
        result = instance.adequateResourceInventory(item, amount);
        assertEquals(expResult, result, 0.0001);
        
        /* Test case #3*/
        
        System.out.println("/tTest case #3");
        // Input values for test case 3
        item = 25.0;
        amount = -1.0;
        expResult = -1;
        result = instance.adequateResourceInventory(item, amount);
        assertEquals(expResult, result, 0.0001);
        
        /* Test case #4*/
        
        System.out.println("/tTest case #4");
        // Input values for test case 4
        item = 15.0;
        amount = 25.0;
        expResult = -1;
        result = instance.adequateResourceInventory(item, amount);
        assertEquals(expResult, result, 0.0001);
        
        /* Test case #5*/
        
        System.out.println("/tTest case #5");
        // Input values for test case 5
        item = 1.0;
        amount = 0.0;
        expResult = 1;
        result = instance.adequateResourceInventory(item, amount);
        assertEquals(expResult, result, 0.0001);
        
        /* Test case #6*/
        
        System.out.println("/tTest case #6");
        // Input values for test case 6
        item = 50.0;
        amount = 1.0;
        expResult = 49;
        result = instance.adequateResourceInventory(item, amount);
        assertEquals(expResult, result, 0.0001);
        
        /* Test case #7*/
        
        System.out.println("/tTest case #7");
        // Input values for test case 7
        item = 99.0;
        amount = 50.0;
        expResult = 49;
        result = instance.adequateResourceInventory(item, amount);
        assertEquals(expResult, result, 0.0001);
        
    }
    
}
