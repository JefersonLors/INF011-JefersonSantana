package securityImplementation.composites;

import securityImplementation.components.Item;

public interface ItemComposite extends Item {
    ItemComposite addItem(Item item) throws Exception;
    ItemComposite removeItem(Item item) throws Exception;;
    Item getItem(int itemCode) throws Exception;
}
