package defaultImplementation;

import defaultImplementation.concreteFactorys.IbanezGuitarFactory;
import defaultImplementation.factorys.GuitarFactory;
import defaultImplementation.products.*;

public class Client {
    public static void main(String[] args) {
        Guitar guitar = (new Client()).factoryGuitars();
        guitar.identifyGuitar();

    }
    public Guitar factoryGuitars(){
        GuitarFactory guitarFactory =  new IbanezGuitarFactory();
        Guitar guitar = guitarFactory.createGuitar();
        Brigde bridge =  guitarFactory.createBridge();
        Pickup topPickup = guitarFactory.createPickup();
        Pickup bottomPickup = guitarFactory.createPickup();
        StringPack stringPack = guitarFactory.createStringPack();
        StringHolderPack stringHolderPack =  guitarFactory.createStringHolderPack();

        guitar.setBridge(bridge);
        guitar.setTopPickup(topPickup);
        guitar.setBottomPickup(bottomPickup);
        guitar.setStringHolder(stringHolderPack);
        guitar.setStringPack(stringPack);

        return guitar;
    }

}