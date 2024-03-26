package parametrizedImplementation.concreteProducts.ibanezProducts;

import parametrizedImplementation.products.Brigde;
import parametrizedImplementation.products.GuitarPiece;

public class IbanezBridge implements Brigde, GuitarPiece {
    /**
     *
     */
    @Override
    public void identifyBrigde() {
        System.out.println("Ibanez bridge");
    }
}
