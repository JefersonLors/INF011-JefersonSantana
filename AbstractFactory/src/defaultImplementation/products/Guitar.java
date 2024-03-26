package defaultImplementation.products;

public interface Guitar {
    void identifyGuitar();
    void setTopPickup(Pickup bottomPickup);
    void setBottomPickup(Pickup bottomPickup);
    void setBridge(Brigde bridge);
    void setStringHolder(StringHolderPack stringCatchers);
    void setStringPack(StringPack stringPack);
}
