package parametrizedImplementation;

import parametrizedImplementation.concreteFactorys.FenderGuitarFactory;
import parametrizedImplementation.concreteFactorys.IbanezGuitarFactory;
import parametrizedImplementation.concreteFactorys.TagimaGuitarFactory;
import parametrizedImplementation.factorys.GuitarFactory;
import parametrizedImplementation.products.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Guitar guitar = (new Client()).factoryGuitars();
    }
    public Guitar factoryGuitars() throws Exception {
        GuitarFactory guitarFactory =  new TagimaGuitarFactory();
        Guitar guitar = (Guitar) guitarFactory.createPiece("Guitar");
        Brigde bridge = (Brigde) guitarFactory.createPiece("Bridge");
        Pickup topPickup = (Pickup) guitarFactory.createPiece("Pickup");
        Pickup bottomPickup = (Pickup) guitarFactory.createPiece("Pickup");
        StringPack stringPack = (StringPack) guitarFactory.createPiece("StringPack");
        StringHolderPack stringHolderPack = (StringHolderPack) guitarFactory.createPiece("StringHolderPack");
        Amplifier amplifier = (Amplifier) guitarFactory.createPiece("amplifier");

        guitar.setBridge(bridge);
        guitar.setTopPickup(topPickup);
        guitar.setBottomPickup(bottomPickup);
        guitar.setStringHolder(stringHolderPack);
        guitar.setStringPack(stringPack);

        guitar.identifyGuitar();
        amplifier.identifyAmplifier();
        amplifier.play();

        return guitar;
    }

}