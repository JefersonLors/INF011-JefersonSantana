package securityImplementation.leafs;

import securityImplementation.components.Item;

public class SpiceSpray implements Item {
    private final double weight;
    private final double volume;

    public SpiceSpray(double volume, double weight){
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
        return this.getVolume();
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
