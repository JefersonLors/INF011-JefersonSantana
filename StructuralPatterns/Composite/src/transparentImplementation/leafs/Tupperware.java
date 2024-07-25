package transparentImplementation.leafs;

import transparentImplementation.components.Item;

public class Tupperware implements Item {
    private double weight;
    private double volume;

    public Tupperware(double volume, double weight){
        this.volume = volume;
        this.weight = weight;
    }

    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public double getFreeSpace() {
        return 0;
    }

    @Override
    public double getUsedSpace() {
        return getVolume();
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void seeInside() {
        System.out.println("\t" + getClass().getName());
    }

    @Override
    public Item addItem(Item item) throws Exception {
        throw new Exception("That item has not children");
    }

    @Override
    public Item removeItem(Item item) throws Exception {
        throw new Exception("That item has not children");
    }

    @Override
    public Item getItem(int itemCode) throws Exception {
        throw new Exception("That item has not children");
    }
}
