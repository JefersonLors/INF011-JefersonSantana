package concreteComponents;

import components.Coffee;

public class LatteCoffe implements Coffee {
    private final String description = "Latte Coffee";
    private final Double cost = 4.99;
    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public Double getCost() {
        return this.cost;
    }

    @Override
    public String toString(){
        return "Description: " + getDescription()+
                "\nCost: " + getCost();
    }
}
