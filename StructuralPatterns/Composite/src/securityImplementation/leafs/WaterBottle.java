package securityImplementation.leafs;

import securityImplementation.components.Item;

public class WaterBottle implements Item {
    private double weight;
    private double volume;

    public WaterBottle(double volume, double weight){
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
}
