package securityImplementation;

import securityImplementation.components.Item;
import securityImplementation.composites.Backpack;
import securityImplementation.composites.Bag;
import securityImplementation.composites.ItemComposite;
import securityImplementation.leafs.SpiceSpray;
import securityImplementation.leafs.Tupperware;
import securityImplementation.leafs.WaterBottle;

public class Client {
    public static void main(String[] args) throws Exception {
        //Cliente não pode tratar com transparência composites e leafs
        Item wateBottleA = new WaterBottle(20, 12);
        Item tupperWareA = new Tupperware(23, 23);
        Item spiceSprayA = new SpiceSpray(23, 5);

        ItemComposite backpack = new Backpack(1200, 3);

        backpack.addItem(wateBottleA)
                 .addItem(tupperWareA)
                 .addItem(new Backpack(134, 32)
                            .addItem(new WaterBottle(13, 23))
                            .addItem(new Backpack(60, 1)
                                    .addItem(spiceSprayA))
                 ).addItem(new WaterBottle(2, 4))
                 .addItem(new SpiceSpray(32, 10))
                 .addItem(new Bag(450, 90)
                         .addItem(new WaterBottle(23, 5)))
                 .seeInside();

         System.out.println(backpack);

        System.out.println(backpack.getItem(2));
    }
}