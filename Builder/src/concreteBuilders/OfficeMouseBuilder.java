package concreteBuilders;

import builders.MouseBuilder;
import products.OfficeMouse;
import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.cords.FabricCord;

public class OfficeMouseBuilder implements MouseBuilder {
    private Dimension dimension;
    private BluetoothModule bluetoothModule;
    private LightModule lightModule;
    private Scroll scroll;
    private BatteryModule batteryModule;
    private Material material;
    private Sensor sensor;
    private Button rightClickButton;
    private Button leftClickButton;
    private Button powerButton;
    private Button saveEnergyModeButton;

    @Override
    public MouseBuilder withDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    @Override
    public MouseBuilder withBluetoothModule(BluetoothModule bluetoothModule) {
        this.bluetoothModule = bluetoothModule;
        return this;
    }

    @Override
    public MouseBuilder withBatteryModule(BatteryModule batteryModule) {
        this.batteryModule = batteryModule;
        return this;
    }

    @Override
    public MouseBuilder withCord(Cord cord) {
        return null;
    }

    @Override
    public MouseBuilder withRgbModule(LightModule lightModule) {
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
        return null;
    }

    @Override
    public MouseBuilder withExtraLeftButtonB(Button extraLeftButtonB) {
        return null;
    }

    @Override
    public MouseBuilder withExtraLeftButtonC(Button extraLeftButtonC) {
        return null;
    }

    public OfficeMouse build(){
        return new OfficeMouse(this.dimension, this.bluetoothModule, this.lightModule, this.scroll,
                                this.batteryModule, this.material, this.sensor, this.rightClickButton,
                                this.leftClickButton, this.powerButton, this.saveEnergyModeButton);
    }
}
