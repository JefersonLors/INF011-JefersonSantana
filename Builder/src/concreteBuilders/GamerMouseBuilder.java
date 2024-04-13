package concreteBuilders;

import builders.MouseBuilder;
import products.GamerMouse;
import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.cords.FabricCord;

public class GamerMouseBuilder implements MouseBuilder {
    private Dimension dimension;
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

    @Override
    public void withDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public MouseBuilder withBluetoothModule(BluetoothModule bluetoothModule) {
        this.bluetoothModule = bluetoothModule;
        return this;
    }

    @Override
    public MouseBuilder withBatteryModule(BatteryModule batteryModule) {
        return null;
    }

    @Override
    public MouseBuilder withCord(Cord cord) {
        this.cord = cord;
        return this;
    }

    @Override
    public MouseBuilder withLightModule(LightModule lightModule) {
        this.lightModule = lightModule;
        return this;
    }

    @Override
    public MouseBuilder withScroll(Scroll scroll) {
        this.scroll = scroll;
        return this;
    }

    @Override
    public MouseBuilder withMaterial(Material material) {
        this.material = material;
        return this;
    }

    @Override
    public MouseBuilder withSensor(Sensor sensor) {
        this.sensor = sensor;
        return this;
    }

    @Override
    public MouseBuilder withRightClickButton(Button rightClickButton) {
        this.rightClickButton = rightClickButton;
        return this;
    }

    @Override
    public MouseBuilder withLeftClickButton(Button leftClickButton) {
        this.leftClickButton = leftClickButton;
        return this;
    }

    @Override
    public MouseBuilder withPowerButton(Button powerButton) {
        this.powerButton = powerButton;
        return this;
    }

    @Override
    public MouseBuilder withSaveEnergyModeButton(Button saveEnergyModeButton) {
        this.saveEnergyModeButton = saveEnergyModeButton;
        return this;
    }

    @Override
    public MouseBuilder withExtraLeftButtonA(Button extraLeftButtonA) {
        this.extraLeftButtonA = extraLeftButtonA;
        return this;
    }

    @Override
    public MouseBuilder withExtraLeftButtonB(Button extraLeftButtonB) {
        this.extraLeftButtonB = extraLeftButtonB;
        return this;
    }

    @Override
    public MouseBuilder withExtraLeftButtonC(Button extraLeftButtonC) {
        this.extraLeftButtonC = extraLeftButtonC;
        return this;
    }

    public GamerMouse build(){
        return new GamerMouse(this.bluetoothModule, this.cord, this.lightModule, this.scroll,
                                this.material, this.sensor, this.rightClickButton, this.leftClickButton,
                                this.powerButton, this.saveEnergyModeButton, this.extraLeftButtonA,
                                this.extraLeftButtonB, this.extraLeftButtonC, this.dimension);
    }
}
