package parametrizedImplementation.concreteProducts.tagimaProducts;

import parametrizedImplementation.products.GuitarPiece;
import parametrizedImplementation.products.StringPack;

public class TagimaStringPack implements StringPack, GuitarPiece {
    /**
     *
     */
    @Override
    public void identifyStringPack() {
        System.out.println("Tagima string pack");
    }
}
