package parametrizedImplementation.factorys;

import parametrizedImplementation.products.GuitarPiece;

public abstract class GuitarFactory {
    public abstract GuitarPiece createPiece(String piece) throws Exception;
}
