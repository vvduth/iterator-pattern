package Interators;

import Inventories.HandheldInventory;
import interfaces.Items;

public class HandheldInventoryIterator implements InventoryIterator {
    private HandheldInventory inventory;  
    private int index ; 
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
        return null;
    }
    
}
