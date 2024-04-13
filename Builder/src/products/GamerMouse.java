package products;

import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.Position;
import products.concreteComponentes.cords.CarbonFiberCord;
import products.concreteComponentes.cords.FabricCord;

public class GamerMouse {
    private Dimension dimension;
    private Position position;
    private BluetoothModule bluetoothModule;
    private Cord cord;
    private LightModule lightModule;
    private Scroll scroll;
    private Material material;
    private Sensor sensor;
    private Button rightClickButton;
    private Button leftClickButton;
    private Button powerButton;
    private Button saveEnergyModeButton;
    private Button extraLeftButtonA;
    private Button extraLeftButtonB;
    private Button extraLeftButtonC;

    public GamerMouse(BluetoothModule bluetoothModule,
                      Cord cord, LightModule lightModule, Scroll scroll, Material material,
                      Sensor sensor, Button rightClickButton, Button leftClickButton,
                      Button powerButton, Button saveEnergyModeButton, Button extraLeftButtonA,
                      Button extraLeftButtonB, Button extraLeftButtonC, Dimension dimension) {
        this.bluetoothModule = bluetoothModule;
        this.cord = cord;
        this.lightModule = lightModule;
        this.scroll = scroll;
        this.material = material;
        this.sensor = sensor;
        this.rightClickButton = rightClickButton;
        this.leftClickButton = leftClickButton;
        this.powerButton = powerButton;
        this.saveEnergyModeButton = saveEnergyModeButton;
        this.extraLeftButtonA = extraLeftButtonA;
        this.extraLeftButtonB = extraLeftButtonB;
        this.extraLeftButtonC = extraLeftButtonC;
        this.dimension = dimension;
    }

    public void pressExtraLeftButtonC(){
        this.extraLeftButtonC.click("extra left button C pressed");
    }
    public void pressExtraLeftButtonB(){
        this.extraLeftButtonB.click("extra left button B pressed");
    }
    public void pressExtraLeftButtonA(){
        this.extraLeftButtonA.click("extra left button A pressed");
    }
    public void pressSaveEnergyModeButton(){
        this.saveEnergyModeButton.click("save energy mode button pressed");
    }
    public void pressPowerButton(){
        this.powerButton.click("power button pressed");
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
