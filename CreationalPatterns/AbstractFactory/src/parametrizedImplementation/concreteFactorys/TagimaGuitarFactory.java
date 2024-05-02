package parametrizedImplementation.concreteFactorys;

import parametrizedImplementation.concreteProducts.tagimaProducts.*;
import parametrizedImplementation.factorys.GuitarFactory;
import parametrizedImplementation.products.GuitarPiece;

public class TagimaGuitarFactory extends GuitarFactory {
    @Override
    public GuitarPiece createPiece(String piece) throws Exception {
        if( piece.equalsIgnoreCase("guitar"))
            return new TagimaGuitar();
        if( piece.equalsIgnoreCase("stringPack"))
            return new TagimaStringPack();
        if( piece.equalsIgnoreCase("stringHolderPack"))
            return new TagimaStringHolderPack();
        if( piece.equalsIgnoreCase("pickup"))
            return new TagimaPickup();
        if( piece.equalsIgnoreCase("bridge"))
            return new TagimaBridge();
        if( piece.equalsIgnoreCase("amplifier"))
            return  new TagimaAmplifier();
        throw new Exception(piece + " is not a available piece on Ibanez factory");
    }
}
