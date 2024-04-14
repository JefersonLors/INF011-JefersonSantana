package concretePrototypes;

import prototypes.Prototype;

public class LED implements Prototype {
    private String color;

    public LED() {
    }
    public LED(LED baseLED){
        this.color = baseLED.color;
    }
    public LED(String color){
        this.color =  color;
    }

    @Override
    public String toString(){
        return "LED[" + this.color + "]";
    }

    @Override
    public Prototype clone() {
        return new LED(this);
    }
}
