package Interators;

import Inventories.HandheldInventory;
import interfaces.Items;

public class HandheldInventoryIterator implements InventoryIterator {
    private HandheldInventory inventory;  
    private int index = 0  ; 
    public HandheldInventoryIterator(HandheldInventory i) {
        this.inventory = i ; 
    }

    @Override
    public boolean HasNext() {
        // TODO Auto-generated method stub
       
        return this.index < 2 ;
    }

    @Override
    public void Next() {
        // TODO Auto-generated method stub
        this.index = this.index + 1 ;
        
    }

    @Override
    public Items current() {
        // TODO Auto-generated method stub
        switch(this.index) {
            case 0: return this.inventory.right ;
            case 1: return this.inventory.left ; 
        }
        return null;
    }
    
}
