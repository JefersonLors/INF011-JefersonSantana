package products.concreteComponentes.buttons;

import products.components.Button;

public class SelectorButton implements Button {
    @Override
    public String toString() {
        return "SelectorButton";
    }

    @Override
    public void click(String message) {
        System.out.println(message);
    }
}
