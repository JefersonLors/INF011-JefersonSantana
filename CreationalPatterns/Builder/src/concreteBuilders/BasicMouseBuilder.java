package concreteBuilders;

import builders.MouseBuilder;
import products.BasicMouse;
import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.cords.FabricCord;

public class BasicMouseBuilder implements MouseBuilder {
    private Dimension dimension;
    private Cord cord;
    private Scroll scroll;
    private Material material;
    private Sensor sensor;
    private Button rightClickButton;
    private Button leftClickButton;

    @Override
    public void withDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public MouseBuilder withBluetoothModule(BluetoothModule bluetoothModule) {
        return null;
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
        return null;
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
        return null;
    }

    @Override
    public MouseBuilder withSaveEnergyModeButton(Button saveEnergyModeButton) {
        return null;
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

    public BasicMouse build(){
        return new BasicMouse(this.cord, this.scroll, this.material, this.sensor,
                                this.rightClickButton, this.leftClickButton, this.dimension);
    }
}
