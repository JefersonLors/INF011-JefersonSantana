package transparentImplementation;

import transparentImplementation.components.Item;
import transparentImplementation.composites.Backpack;
import transparentImplementation.composites.Bag;
import transparentImplementation.leafs.SpiceSpray;
import transparentImplementation.leafs.Tupperware;
import transparentImplementation.leafs.WaterBottle;

public class Client {
    public static void main(String[] args) throws Exception {
        //Cliente pode tratar com transparência composites e leafs
        Item backpack = new Backpack(1200, 3);
        Item waterBottleA = new WaterBottle(20, 12);
        Item tupperWareA = new Tupperware(23, 23);
        Item spiceSprayA = new SpiceSpray(32, 10);

        backpack.addItem(waterBottleA)
                 .addItem(tupperWareA)
                 .addItem(new Backpack(134, 32)
                            .addItem(new WaterBottle(13, 23))
                            .addItem(new Backpack(60, 1)
                                    .addItem(spiceSprayA))
                 ).addItem(new WaterBottle(2, 4))
                 .addItem(new SpiceSpray(23, 5))
                 .addItem(new Bag(450, 90)
                         .addItem(new WaterBottle(23, 5)))
                 .seeInside();

        System.out.println(backpack);

        System.out.println(backpack.getItem(4));
    }
}