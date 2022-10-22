import Interators.InventoryIterator;
import Inventories.HandheldInventory;
import interfaces.Inventory;
import interfaces.Items;

public class App {
    public static void main(String[] args) throws Exception {
        Items item1 = new Items("gun") ;
        Items item2 = new Items("apple");
        Inventory inv = new HandheldInventory(item1, item2) ;
        InventoryIterator iterator = inv.getIterator() ;
        System.out.println();
        while (iterator.HasNext()) {
            Items i = iterator.current() ; 
            // do smt
            System.out.println(i.name);
            iterator.Next();
        }
    }
}
