package Inventories;

import Interators.HandheldInventoryIterator;
import Interators.InventoryIterator;
import interfaces.Inventory;
import interfaces.Items;

public class HandheldInventory implements Inventory {
    // item right: public getter private setter
    // item left. ssam with left

    public Items right ;
    public Items left ; 
 
    
    public HandheldInventory(Items rightHand,Items leftHand) {
        this.right = rightHand ;
        this.left = leftHand ; 
    }
    
    @Override
    public InventoryIterator getIterator() {
        return new HandheldInventoryIterator(this) ; 
    }

  
}
