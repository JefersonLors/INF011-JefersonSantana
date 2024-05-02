package parametrizedImplementation.concreteProducts.fenderProducts;

import parametrizedImplementation.products.Pickup;

public class FenderPickup implements Pickup {
    /**
     *
     */
    @Override
    public void identifyPickup() {
        System.out.println("Fender pickup");
    }
}
