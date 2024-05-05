package decorators;

import components.Coffee;

public abstract class AddOn implements Coffee {
    private Coffee coffee;
    public AddOn(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return this.coffee.getDescription();
    }

    @Override
    public Double getCost() {
        return this.coffee.getCost();
    }
}
