import Interators.InventoryIterator;
import Inventories.HandheldInventory;
import interfaces.Inventory;
import interfaces.Items;

public class App {
    public static void main(String[] args) throws Exception {
        Items item1 = new Items("sword");
        Items item2 = new Items("shield");
        Inventory inv = new HandheldInventory(item1, item2);
        InventoryIterator iterator = inv.getIterator();
        while (iterator.HasNext()) {
            Items currentItem = iterator.current() ;
            System.out.println(currentItem.name);
            iterator.Next(); 
        }
     

    }

    public Items useRightItem(InventoryIterator i) {
        if (i.HasNext()) {
            Items rightItem = i.current();
            return rightItem;
        }
        return null;
    }
}
