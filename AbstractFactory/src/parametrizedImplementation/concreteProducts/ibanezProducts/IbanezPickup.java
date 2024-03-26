package parametrizedImplementation.concreteProducts.ibanezProducts;

import parametrizedImplementation.products.GuitarPiece;
import parametrizedImplementation.products.Pickup;

public class IbanezPickup implements Pickup, GuitarPiece {
    /**
     *
     */
    @Override
    public void identifyPickup() {
        System.out.println("Ibanez pickup");
    }
}
