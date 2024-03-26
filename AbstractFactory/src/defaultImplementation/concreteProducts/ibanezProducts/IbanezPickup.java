package defaultImplementation.concreteProducts.ibanezProducts;

import defaultImplementation.products.Pickup;

public class IbanezPickup implements Pickup {
    /**
     *
     */
    @Override
    public void identifyPickup() {
        System.out.println("Ibanez pickup");
    }
}
