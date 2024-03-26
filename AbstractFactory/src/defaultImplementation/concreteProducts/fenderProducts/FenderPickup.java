package defaultImplementation.concreteProducts.fenderProducts;

import defaultImplementation.products.Pickup;

public class FenderPickup implements Pickup {
    /**
     *
     */
    @Override
    public void identifyPickup() {
        System.out.println("Fender pickup");
    }
}
