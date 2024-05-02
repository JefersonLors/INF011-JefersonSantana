package products;

import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.Position;
import products.concreteComponentes.cords.CarbonFiberCord;
import products.concreteComponentes.cords.FabricCord;

public class GamerMouse {
    private Dimension dimensions;
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
                      Button extraLeftButtonB, Button extraLeftButtonC, Dimension dimensions) {
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
        this.dimensions = dimensions;
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

    @Override
    public String toString(){
        return "Dimensions: " + this.dimensions +
                "\nBluetooth Module: " + this.bluetoothModule +
                "\nLight Module: " + this.lightModule +
                "\nCord: " + this.cord +
                "\nScroll: " + this.scroll +
                "\nMaterial: " + this.material +
                "\nSensor: " + this.sensor +
                "\nRight Button: " + this.rightClickButton +
                "\nLeft Button: " + this.leftClickButton +
                "\nExtra Left Button A: " + this.extraLeftButtonA +
                "\nExtra Left Button B: " + this.extraLeftButtonB +
                "\nExtra Left Button C: " + this.extraLeftButtonC +
                "\nPower Button: " + this.powerButton +
                "\nSave Energy ModeButton: " + this.saveEnergyModeButton;
    }
}
