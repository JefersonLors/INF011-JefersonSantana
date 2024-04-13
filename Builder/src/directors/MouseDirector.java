package directors;

import builders.MouseBuilder;
import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.buttons.FlatButton;
import products.concreteComponentes.cords.PlasticCord;
import products.concreteComponentes.materials.CommomPlasticMaterial;
import products.concreteComponentes.scrolls.BasicScroll;
import products.concreteComponentes.sensors.BasicSensor;

public class MouseDirector {
    private Dimension dimension;
    private Cord cord;
    private Scroll scroll;
    private Material material;
    private Sensor sensor;
    private Button rightClickButton;
    private Button leftClickButton;
    public void buildBasicMouse(MouseBuilder basicMouseBuilder){
        basicMouseBuilder.withDimension(new Dimension(12, 6, 5))
                .withCord(new PlasticCord())
                .withScroll( new BasicScroll())
                .withMaterial(new CommomPlasticMaterial())
                .withSensor(new BasicSensor())
                .withRightClickButton(new FlatButton())
                .withLeftClickButton(new FlatButton());
    }
}
