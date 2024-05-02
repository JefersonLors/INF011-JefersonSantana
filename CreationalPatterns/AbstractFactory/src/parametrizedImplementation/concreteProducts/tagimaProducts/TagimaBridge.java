package parametrizedImplementation.concreteProducts.tagimaProducts;

import parametrizedImplementation.products.Brigde;
import parametrizedImplementation.products.GuitarPiece;

public class TagimaBridge implements Brigde, GuitarPiece {
    /**
     *
     */
    @Override
    public void identifyBrigde() {
        System.out.println("Tagima bridge");
    }
}
