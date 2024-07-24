import components.Item;
import composites.Backpack;
import composites.Bag;
import leafs.SpiceSpray;
import leafs.Tupperware;
import leafs.WaterBottle;

public class Client {
    public static void main(String[] args) throws Exception {
        Item backpack = new Backpack(1200, 3);

         backpack.addItem(new WaterBottle(20, 12))
                 .addItem(new Tupperware(23, 23))
                 .addItem(new Backpack(134, 32)
                            .addItem(new WaterBottle(13, 23))
                            .addItem(new Backpack(60, 1)
                                    .addItem(new SpiceSpray(32, 10)))
                 ).addItem(new WaterBottle(2, 4))
                 .addItem(new SpiceSpray(23, 5))
                 .addItem(new Bag(450, 90)
                         .addItem(new WaterBottle(23, 5)))
                 .seeInside();

         System.out.println(backpack);

        System.out.println(backpack.getItem(0));
    }
}