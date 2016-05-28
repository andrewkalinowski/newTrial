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
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of addToInventory method, of class InventoryControl.
     */
    @Test
    public void testAddToInventory() {
        System.out.println("addToInventory Test 1");
        int total = 12;
        int amount = 55;
        InventoryControl instance = new InventoryControl();
        int expResult = 67;
        int result = instance.addToInventory(total, amount);
        assertEquals(expResult, result);
        
        System.out.println("addToInventory Test 2");
        total = -15;
        amount = 25;
        expResult = -1;
        result = instance.addToInventory(total, amount);
        assertEquals(expResult, result);
        
        System.out.println("addToInventory Test 3");
        total = 14;
        amount = -300;
        expResult = -1;
        result = instance.addToInventory(total, amount);
        assertEquals(expResult, result);
        
        System.out.println("addToInventory Test 4");
        total = 12;
        amount = 200;
        expResult = -1;
        result = instance.addToInventory(total, amount);
        assertEquals(expResult, result);
        
        System.out.println("addToInventory Test 5");
        total = 0;
        amount = 100;
        expResult = 100;
        result = instance.addToInventory(total, amount);
        assertEquals(expResult, result);
        
        System.out.println("addToInventory Test 6");
        total = 100;
        amount = 0;
        expResult = 100;
        result = instance.addToInventory(total, amount);
        assertEquals(expResult, result);
        
        System.out.println("addToInventory Test 7");
        total = 100;
        amount = 0;
        expResult = 100;
        result = instance.addToInventory(total, amount);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeFromInventory method, of class InventoryControl.
     */
    @Test
    public void testRemoveFromInventory() {
        System.out.println("removeFromInventory Test 1");
        int item = 55;
        int amount = 10;
        InventoryControl instance = new InventoryControl();
        int expResult = 45;
        int result = instance.removeFromInventory(item, amount);
        assertEquals(expResult, result);
        
        System.out.println("removeFromInventory Test 2");
        item = -5;
        amount = 33;
        expResult = -1;
        result = instance.removeFromInventory(item, amount);
        assertEquals(expResult, result);
        
        System.out.println("removeFromInventory Test 3");
        item = 22;
        amount = -55;
        expResult = -1;
        result = instance.removeFromInventory(item, amount);
        assertEquals(expResult, result);
        
        System.out.println("removeFromInventory Test 4");
        item = 22;
        amount = 100;
        expResult = -1;
        result = instance.removeFromInventory(item, amount);
        assertEquals(expResult, result);
        
        System.out.println("removeFromInventory Test 5");
        item = 0;
        amount = 0;
        expResult = 0;
        result = instance.removeFromInventory(item, amount);
        assertEquals(expResult, result);
        
        System.out.println("removeFromInventory Test 6");
        item = 99;
        amount = 0;
        expResult = 99;
        result = instance.removeFromInventory(item, amount);
        assertEquals(expResult, result);
        
        System.out.println("removeFromInventory Test 7");
        item = 100;
        amount = 100;
        expResult = 0;
        result = instance.removeFromInventory(item, amount);
        assertEquals(expResult, result);
    }
    /**
     * Test of storeItem method, of class InventoryControl.
     */
    @Test
    public void testStoreItem() {
        System.out.println("storeItem Test 1");
        int item = 1;
        int amount = 15;
        int cost = 100;
        int pocket = 2000;
        InventoryControl instance = new InventoryControl();
        int expResult = 500;
        int result = instance.storeItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("storeItem Test 2");
        item = 1;
        amount = -22;
        cost = 300;
        pocket = 500000;
        expResult = -1;
        result = instance.storeItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("storeItem Test 3");
        item = 1;
        amount = 22;
        cost = -600;
        pocket = 45000;
        expResult = -1;
        result = instance.storeItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("storeItem Test 4");
        item = 1;
        amount = 13;
        cost = 1300;
        pocket = -500;
        expResult = -1;
        result = instance.storeItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("storeItem Test 5");
        item = 1;
        amount = 280;
        cost = 300;
        pocket = 1000000;
        expResult = -1;
        result = instance.storeItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("storeItem Test 6");
        item = 1;
        amount = 99;
        cost = 5000;
        pocket = 1000000;
        expResult = 505000;
        result = instance.storeItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("storeItem Test 7");
        item = 1;
        amount = 99;
        cost = 100;
        pocket = 1000000;
        expResult = 990100;
        result = instance.storeItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
    }

    /**
     * Test of sellItem method, of class InventoryControl.
     */
    @Test
    public void testSellItem() {
        System.out.println("sellItem Test 1");
        int item = 1;
        int amount = 20;
        int cost = 100;
        int pocket = 500;
        InventoryControl instance = new InventoryControl();
        int expResult = 1500;
        int result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("sellItem Test 2");
        item = 1;
        amount = -2;
        cost = 1000;
        pocket = 4500;
        expResult = -1;
        result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("sellItem Test 3");
        item = -1;
        amount = 2;
        cost = 20000;
        pocket = 500;
        expResult = -1;
        result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("sellItem Test 4");
        item = 1;
        amount = 14;
        cost = -100;
        pocket = 751;
        expResult = -1;
        result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("sellItem Test 5");
        item = 1;
        amount = 25;
        cost = 50;
        pocket = -40500;
        expResult = -1;
        result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("sellItem Test 6");
        item = 1;
        amount = 20;
        cost = 1000;
        pocket = 999999;
        expResult = -1;
        result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("sellItem Test 7");
        item = 1;
        amount = 99;
        cost = 5000;
        pocket = 5000;
        expResult = 252500;
        result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
        
        System.out.println("sellItem Test 8");
        item = 1;
        amount = 0;
        cost = 5000;
        pocket = 5000;
        expResult = 5000;
        result = instance.sellItem(item, amount, cost, pocket);
        assertEquals(expResult, result);
    }
    
}
