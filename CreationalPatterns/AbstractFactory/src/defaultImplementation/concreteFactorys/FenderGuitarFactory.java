package defaultImplementation.concreteFactorys;

import defaultImplementation.concreteProducts.fenderProducts.*;
import defaultImplementation.factorys.GuitarFactory;
import defaultImplementation.products.*;

public class FenderGuitarFactory extends GuitarFactory {

    /**
     * @return Guitar
     */
    @Override
    public Guitar createGuitar() {
        return new FenderGuitar();
    }

    /**
     * @return Brigde
     */
    @Override
    public Brigde createBridge() {
        return new FenderBridge();
    }

    /**
     * @return StringPack
     */
    @Override
    public StringPack createStringPack() {
        return new FenderStringPack();
    }

    /**
     * @return StringHolderPack
     */
    @Override
    public StringHolderPack createStringHolderPack() {
        return new FenderStringHolderPack();
    }

    /**
     * @return Pickup
     */
    @Override
    public Pickup createPickup() {
        return new FenderPickup();
    }
}
