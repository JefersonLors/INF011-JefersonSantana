package parametrizedImplementation.concreteFactorys;

import parametrizedImplementation.concreteProducts.fenderProducts.FenderBridge;
import parametrizedImplementation.concreteProducts.fenderProducts.FenderPickup;
import parametrizedImplementation.concreteProducts.fenderProducts.FenderStringHolderPack;
import parametrizedImplementation.concreteProducts.fenderProducts.FenderStringPack;
import parametrizedImplementation.concreteProducts.fenderProducts.FenderGuitar;
import parametrizedImplementation.factorys.GuitarFactory;
import parametrizedImplementation.products.*;

public class FenderGuitarFactory extends GuitarFactory {
    /**
     * @param piece
     * @return GuitarPiece
     */
    @Override
    public GuitarPiece createPiece(String piece) throws Exception {
        if( piece.equalsIgnoreCase("guitar"))
            return new FenderGuitar();
        if( piece.equalsIgnoreCase("stringPack"))
            return new FenderStringPack();
        if( piece.equalsIgnoreCase("stringHolderPack"))
            return new FenderStringHolderPack();
        if( piece.equalsIgnoreCase("pickup"))
            return new FenderPickup();
        if( piece.equalsIgnoreCase("bridge"))
            return new FenderBridge();
        throw new Exception(piece + " is not a available piece on Fender factory");
    }
}
