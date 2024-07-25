package transparentImplementation.composites;

import transparentImplementation.components.Item;

import java.util.ArrayList;
import java.util.List;

public class Backpack implements Item {
    private List<Item> items;
    private double volume;
    private double weight;

    public Backpack(double volume, double weight){
        this.volume = volume;
        this.weight = weight;
        this.items = new ArrayList<>();
    }
    @Override
    public double getVolume() {
        return this.volume;
    }

    @Override
    public double getFreeSpace() {
        return this.getVolume() - this.getUsedSpace();
    }

    @Override
    public double getUsedSpace() {
        double total = 0;
        for(Item item : items){
            total += item.getVolume();
        }
        return total;
    }

    @Override
    public double getWeight() {
        double total = 0;

        for(Item item : items){
            total += item.getWeight();
        }

        return total + this.weight;
    }

    @Override
    public void seeInside() {
        System.out.println(getClass().getName());

        for(Item item : items){
            System.out.print("\t");
            item.seeInside();
        }
    }

    @Override
    public Item addItem(Item item) throws Exception {
        if(item != null && item.getVolume() <= this.getFreeSpace()){
           this.items.add(item);
        }else{
            throw new Exception("That item doesn't feet here");
        }
        return this;
    }

    @Override
    public Item removeItem(Item item) {
        if( item != null ){
            this.items.remove(item);
            return this;
        }
        return null;
    }

    @Override
    public Item getItem(int itemCode) throws Exception {
        if( itemCode <= this.items.size())
            return this.items.get(itemCode);
        throw new Exception("That item is not here.");
    }
    @Override
    public String toString(){
        StringBuilder content = new StringBuilder();
        content.append(getClass().getName());
        content.append("{\n");
        content.append("\tTotal Volume: " + this.volume + "\n");
        content.append("\tOcupied Volume: " + this.getUsedSpace() + "\n");
        content.append("\tItem Weight: " + this.weight + "\n");
        content.append("\tTotal Weight: " + this.getWeight() + "\n");
        content.append("}");
        return content.toString();
    }
}
