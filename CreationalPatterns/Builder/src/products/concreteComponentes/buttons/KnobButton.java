package products.concreteComponentes.buttons;

import products.components.Button;

public class KnobButton implements Button {
    @Override
    public String toString() {
        return "KnobButton";
    }

    @Override
    public void click(String message) {
        System.out.println(message);
    }
}
