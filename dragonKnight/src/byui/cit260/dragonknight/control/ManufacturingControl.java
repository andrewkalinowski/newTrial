package byui.cit260.dragonknight.control;

/**
 *
 * @author DragonmanJoel
 */
public class ManufacturingControl {

    public double adequateResourceInventory(double item, double amount) {

        if (item < 0 || item > 101 || amount < 0 || amount > 51) {
            return -1;
        }
        
        if (amount > item){
            return -1;
        }
        
        double adequate = item - amount;

        return adequate;
        
    }

}
