package builders;

import products.components.*;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.cords.FabricCord;

public interface MouseBuilder {
    public abstract MouseBuilder withDimension(Dimension dimension);

    public MouseBuilder withBluetoothModule(BluetoothModule bluetoothModule);

    public MouseBuilder withBatteryModule(BatteryModule bateryModule);

    public MouseBuilder withCord(Cord cord);

    public MouseBuilder withRgbModule(LightModule rgbModule);

    public MouseBuilder withScroll(Scroll scroll);

    public MouseBuilder withMaterial(Material material);

    public MouseBuilder withSensor(Sensor sensor);

    public MouseBuilder withRightClickButton(Button rightClickButton);

    public MouseBuilder withLeftClickButton(Button leftClickButton);

    public MouseBuilder withPowerButton(Button powerButton);

    public MouseBuilder withSaveEnergyModeButton(Button saveEnergyModeButton);

    public MouseBuilder withExtraLeftButtonA(Button extraLeftButtonA);

    public MouseBuilder withExtraLeftButtonB(Button extraLeftButtonB);

    public MouseBuilder withExtraLeftButtonC(Button extraLeftButtonC);
}
