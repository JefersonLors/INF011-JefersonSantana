package parametrizedImplementation.concreteProducts.ibanezProducts;

import parametrizedImplementation.products.GuitarPiece;
import parametrizedImplementation.products.StringHolderPack;

public class IbanezStringHolderPack implements StringHolderPack, GuitarPiece {
    /**
     *
     */
    @Override
    public void identifyStringHolderPack() {
        System.out.println("Ibanez string holder pack");
    }
}
