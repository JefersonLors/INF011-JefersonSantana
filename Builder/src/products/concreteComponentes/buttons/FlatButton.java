package products.concreteComponentes.buttons;

import products.components.Button;

public class FlatButton implements Button {
    @Override
    public void click(String message) {
        System.out.println(message);
    }
}
