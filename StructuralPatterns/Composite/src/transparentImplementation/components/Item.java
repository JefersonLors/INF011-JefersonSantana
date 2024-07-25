package transparentImplementation.components;

public interface Item {
    double getVolume();
    double getFreeSpace();
    double getUsedSpace();
    double getWeight();
    void seeInside();
    Item addItem(Item item) throws Exception;
    Item removeItem(Item item) throws Exception;;
    Item getItem(int itemCode) throws Exception;
}
