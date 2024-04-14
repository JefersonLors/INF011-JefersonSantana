package concretePrototypes;

import prototypes.Prototype;

public class Button implements Prototype {
    private String nameButton;

    public Button() {
    }
    public Button(Button baseButton){
        this.nameButton = baseButton.nameButton;
    }
    public Button(String nameButton){
        this.nameButton = nameButton;
    }

    @Override
    public String toString(){
        return "Button[" + this.nameButton + "]";
    }

    @Override
    public Prototype clone() {
        return new Button(this);
    }

}
