package Interators;

import interfaces.Items;

public interface InventoryIterator {
    boolean HasNext() ;
    void Next() ;
    Items current() ; 
}
