package concreteDecorators;

import components.Coffee;
import decorators.AddOn;

public class Sugar extends AddOn {
    private final int sugarMl;
    private final double sugarCostForMl = 0.10;
    public Sugar(Coffee coffee, int sugarMl){
        super(coffee);
        this.sugarMl = sugarMl;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + " +  this.addSugar();
    }

    @Override
    public Double getCost(){
        return super.getCost() + this.addCost();
    }

    private String addSugar(){
        return "Sugar ("+ this.sugarMl + "ml)";
    }

    private Double addCost(){
        return this.sugarCostForMl * this.sugarMl;
    }

    @Override
    public String toString(){
        return "Description: " + getDescription()+
                "\nCost: " + getCost();
    }
}
