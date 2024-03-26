package parametrizedImplementation.concreteFactorys;

import parametrizedImplementation.concreteProducts.fenderProducts.*;
import parametrizedImplementation.concreteProducts.ibanezProducts.*;
import parametrizedImplementation.factorys.GuitarFactory;
import parametrizedImplementation.products.*;

public class IbanezGuitarFactory extends GuitarFactory {
    @Override
    public GuitarPiece createPiece(String piece) throws Exception {
        if( piece.equalsIgnoreCase("guitar"))
            return new IbanezGuitar();
        if( piece.equalsIgnoreCase("stringPack"))
            return new IbanezStringPack();
        if( piece.equalsIgnoreCase("stringHolderPack"))
            return new IbanezStringHolderPack();
        if( piece.equalsIgnoreCase("pickup"))
            return new IbanezPickup();
        if( piece.equalsIgnoreCase("bridge"))
            return new IbanezBridge();
        throw new Exception(piece + " is not a available piece on Ibanez factory");
    }
}
