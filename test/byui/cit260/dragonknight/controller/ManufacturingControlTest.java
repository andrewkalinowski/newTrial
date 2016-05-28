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
public class ManufacturingControlTest {
    
    public ManufacturingControlTest() {
    }
    
}
/** Test of calculateManufacturingSpell method, of class ManufacturingController.
 * 
 */
@Test
public void testCalculateManufactureSpell(){
 System.out.println("calculateManufactureSpell");
 double resource = 4.0;
 double amount = -5.0;
 double item = 7.0;
 ManufacturingControl instance = new ManufacturingControl();
 double expResult =-1;
 double result = instance.calculateManufactureSpell (resource, amount,item);
assertEquals (expResult, result, 0.01);


System.out.println("calculateManufactureSpell");
resource = -2.0;
 amount = 10.0;
 item = 9.0;
 expResult =-1;
 result = instance.calculateManufactureSpell (resource, amount,item);
assertEquals (expResult, result, 0.01);

System.out.println("calculateManufactureSpell");
 resource = 9.0;
 amount = 2.0;
 item = 1;
 expResult =18.0;
 result = instance.calculateManufactureSpell (resource, amount,item);
assertEquals (expResult, result, 0.01);
}