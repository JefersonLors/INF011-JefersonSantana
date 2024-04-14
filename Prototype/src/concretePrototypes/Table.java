package concretePrototypes;

import prototypes.Prototype;

public class Table implements Prototype {
    private Button button;
    private LED led;
    private Switcher switcher;

    public Table() {
    }

    public Table(Table baseTable){
        this.button = (Button) baseTable.button.clone();
        this.led = (LED) baseTable.led;
        this.switcher = (Switcher) baseTable.switcher;
    }

    public Table(Button button, LED led, Switcher switcher) {
        this.button = button;
        this.led = led;
        this.switcher = switcher;
    }

    @Override
    public String toString(){
        return "{\n\t " + this.button + "\n\t " + this.led + "\n\t " + this.switcher + "\n}";
    }

    @Override
    public Prototype clone() {
        return new Table(this);
    }

}
