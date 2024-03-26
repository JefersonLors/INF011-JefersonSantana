package parametrizedImplementation.concreteProducts.ibanezProducts;

import parametrizedImplementation.products.GuitarPiece;
import parametrizedImplementation.products.StringPack;

public class IbanezStringPack implements StringPack, GuitarPiece {
    /**
     *
     */
    @Override
    public void identifyStringPack() {
        System.out.println("Ibanez string pack");
    }
}
