package parametrizedImplementation.products;

public interface Guitar extends GuitarPiece{
    void identifyGuitar();
    void setTopPickup(Pickup bottomPickup);
    void setBottomPickup(Pickup bottomPickup);
    void setBridge(Brigde bridge);
    void setStringHolder(StringHolderPack stringCatchers);
    void setStringPack(StringPack stringPack);
}
