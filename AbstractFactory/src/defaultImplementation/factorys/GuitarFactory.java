package defaultImplementation.factorys;

import defaultImplementation.products.*;

public abstract class GuitarFactory {
    public abstract Guitar createGuitar();
    public abstract Brigde createBridge();
    public abstract StringPack createStringPack();
    public abstract StringHolderPack createStringHolderPack();
    public abstract Pickup createPickup();
}
