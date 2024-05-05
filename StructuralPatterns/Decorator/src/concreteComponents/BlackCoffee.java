package concreteComponents;

import components.Coffee;

public class BlackCoffee implements Coffee {
    private final String description = "Black Coffee";
    private final Double cost = 3.99;

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
