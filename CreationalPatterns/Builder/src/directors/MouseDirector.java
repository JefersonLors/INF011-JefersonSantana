package directors;

import builders.MouseBuilder;
import products.concreteComponentes.Dimension;
import products.concreteComponentes.batteryModules.PhillipsModuleBattery;
import products.concreteComponentes.bluetoothModules.HighTechBluetoothModule;
import products.concreteComponentes.buttons.FlatButton;
import products.concreteComponentes.buttons.KnobButton;
import products.concreteComponentes.buttons.SelectorButton;
import products.concreteComponentes.cords.CarbonFiberCord;
import products.concreteComponentes.cords.PlasticCord;
import products.concreteComponentes.lightModules.MonochromaticLightModule;
import products.concreteComponentes.lightModules.RGBLightModule;
import products.concreteComponentes.materials.CommomPlasticMaterial;
import products.concreteComponentes.materials.MattePlasticMaterial;
import products.concreteComponentes.materials.PremiumPlasticMaterial;
import products.concreteComponentes.scrolls.BasicScroll;
import products.concreteComponentes.scrolls.TechScroll;
import products.concreteComponentes.sensors.BasicSensor;
import products.concreteComponentes.sensors.HighTechSensor;

public class MouseDirector {
    public void buildBasicMouse(MouseBuilder basicMouseBuilder){
        basicMouseBuilder
                .withCord(new PlasticCord())
                .withScroll( new BasicScroll())
                .withMaterial(new CommomPlasticMaterial())
                .withSensor(new BasicSensor())
                .withRightClickButton(new FlatButton())
                .withLeftClickButton(new FlatButton())
                .withDimension(new Dimension(12, 6, 5));
    }

    public void buildOfficeMouse(MouseBuilder officeMouseBuilder){
        officeMouseBuilder
                .withBluetoothModule(new HighTechBluetoothModule())
                .withLightModule(new MonochromaticLightModule())
                .withScroll(new TechScroll())
                .withBatteryModule(new PhillipsModuleBattery())
                .withMaterial(new MattePlasticMaterial())
                .withSensor(new HighTechSensor())
                .withRightClickButton(new FlatButton())
                .withLeftClickButton(new FlatButton())
                .withPowerButton(new SelectorButton())
                .withSaveEnergyModeButton(new SelectorButton())
                .withDimension( new Dimension(12, 6, 5));
    }
    public void buildGamerMouse(MouseBuilder gamerMouseBuilder){
        gamerMouseBuilder
                .withBluetoothModule(new HighTechBluetoothModule())
                .withCord(new CarbonFiberCord())
                .withLightModule(new RGBLightModule())
                .withScroll(new TechScroll())
                .withMaterial(new PremiumPlasticMaterial())
                .withSensor(new HighTechSensor())
                .withRightClickButton(new FlatButton())
                .withLeftClickButton(new FlatButton())
                .withPowerButton(new SelectorButton())
                .withSaveEnergyModeButton(new SelectorButton())
                .withExtraLeftButtonA(new KnobButton())
                .withExtraLeftButtonB(new KnobButton())
                .withExtraLeftButtonC(new KnobButton())
                .withDimension( new Dimension(12, 6, 5));

    }
}
