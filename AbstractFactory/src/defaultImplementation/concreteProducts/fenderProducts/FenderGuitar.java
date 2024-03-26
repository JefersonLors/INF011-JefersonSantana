package defaultImplementation.concreteProducts.fenderProducts;

import defaultImplementation.products.*;

public class FenderGuitar implements Guitar {
    private Brigde brigde;
    private StringHolderPack stringHolderPack;
    private StringPack stringPack;
    private Pickup topPickup;
    private Pickup bottomPickup;

    /**
     *
     */
    @Override
    public void identifyGuitar() {
        System.out.println("Fender guitar");
        this.brigde.identifyBrigde();
        this.bottomPickup.identifyPickup();
        this.topPickup.identifyPickup();
        this.stringHolderPack.identifyStringHolderPack();
        this.stringPack.identifyStringPack();
    }

    /**
     * @param topPickup
     */
    @Override
    public void setTopPickup(Pickup topPickup) {
        this.topPickup = topPickup;
    }

    /**
     * @param bottomPickup
     */
    @Override
    public void setBottomPickup(Pickup bottomPickup) {
        this.bottomPickup = bottomPickup;
    }

    /**
     * @param bridge
     */
    @Override
    public void setBridge(Brigde bridge) {
        this.brigde = bridge;
    }

    /**
     * @param stringHolderPack
     */
    @Override
    public void setStringHolder(StringHolderPack stringHolderPack) {
        this.stringHolderPack = stringHolderPack;
    }

    /**
     * @param stringPack
     */
    @Override
    public void setStringPack(StringPack stringPack) {
        this.stringPack = stringPack;
    }
}
