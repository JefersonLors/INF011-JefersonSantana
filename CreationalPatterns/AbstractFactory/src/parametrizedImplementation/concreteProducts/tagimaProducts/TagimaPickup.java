package parametrizedImplementation.concreteProducts.tagimaProducts;

import parametrizedImplementation.products.GuitarPiece;
import parametrizedImplementation.products.Pickup;

public class TagimaPickup implements Pickup, GuitarPiece {
    /**
     *
     */
    @Override
    public void identifyPickup() {
        System.out.println("Tagima pickup");
    }
}
