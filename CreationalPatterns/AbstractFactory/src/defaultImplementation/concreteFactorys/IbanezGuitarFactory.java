package defaultImplementation.concreteFactorys;

import defaultImplementation.concreteProducts.ibanezProducts.*;
import defaultImplementation.factorys.GuitarFactory;
import defaultImplementation.products.*;

public class IbanezGuitarFactory extends GuitarFactory {
    /**
     * @return Guitar
     */
    @Override
    public Guitar createGuitar() {
        return new IbanezGuitar();
    }

    /**
     * @return Brigde
     */
    @Override
    public Brigde createBridge() {
        return new IbanezBridge();
    }

    /**
     * @return StringPack
     */
    @Override
    public StringPack createStringPack() {
        return new IbanezStringPack();
    }

    /**
     * @return StringHolderPack
     */
    @Override
    public StringHolderPack createStringHolderPack() {
        return new IbanezStringHolderPack();
    }

    /**
     * @return Pickup
     */
    @Override
    public Pickup createPickup() {
        return new IbanezPickup();
    }
}
