package parametrizedImplementation.concreteProducts.tagimaProducts;

import parametrizedImplementation.products.GuitarPiece;
import parametrizedImplementation.products.StringHolderPack;

public class TagimaStringHolderPack implements StringHolderPack, GuitarPiece {
    /**
     *
     */
    @Override
    public void identifyStringHolderPack() {
        System.out.println("Tagima string holder pack");
    }
}
