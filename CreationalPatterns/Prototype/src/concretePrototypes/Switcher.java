package concretePrototypes;

import prototypes.Prototype;

public class Switcher implements Prototype {
    private String optionA;
    private String optionB;
    private String optionC;

    public Switcher() {
    }
    public Switcher(Switcher baseSwitcher){
        this.optionA = baseSwitcher.optionA;
        this.optionB = baseSwitcher.optionB;
        this.optionC = baseSwitcher.optionC;
    }
    public Switcher(String optionA, String optionB, String optionC) {
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
    }

    @Override
    public String toString(){
        return "Switcher[" + this.optionA + ", " + this.optionB + ", " + this.optionC + "]";
    }

    @Override
    public Prototype clone() {
        return new Switcher(this);
    }
}
