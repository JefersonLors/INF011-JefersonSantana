package products;

import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.Position;
import products.concreteComponentes.cords.CarbonFiberCord;
import products.concreteComponentes.cords.FabricCord;

public class BasicMouse {
    private Dimension dimensions;
    private Position position;
    private Cord cord;
    private Scroll scroll;
    private Material material;
    private Sensor sensor;
    private Button rightClickButton;
    private Button leftClickButton;

    public BasicMouse(Cord cord, Scroll scroll, Material material,
                      Sensor sensor, Button rightClickButton,
                      Button leftClickButton, Dimension dimensions) {
        this.cord = cord;
        this.scroll = scroll;
        this.material = material;
        this.sensor = sensor;
        this.rightClickButton = rightClickButton;
        this.leftClickButton = leftClickButton;
        this.dimensions = dimensions;
    }

    public void pressLeftClickButton(){
        this.leftClickButton.click("left button pressed");
    }
    public void pressRightClickButton(){
        this.rightClickButton.click("right button pressed");
    }

    public void moveTo(Position position){
        this.position = position;
    }
}
