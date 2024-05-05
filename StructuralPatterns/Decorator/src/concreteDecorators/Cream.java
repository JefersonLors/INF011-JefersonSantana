package concreteDecorators;

import components.Coffee;
import decorators.AddOn;

public class Cream extends AddOn {
    private final int creamMl;
    private final double creamCostForMl = 0.50;
    public Cream(Coffee coffee, int creamMl){
        super(coffee);
        this.creamMl = creamMl;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + " +  this.addCream();
    }

    @Override
    public Double getCost(){
        return super.getCost() + this.addCost();
    }

    private String addCream(){
        return "Cream ("+ this.creamMl + "ml)";
    }

    private Double addCost(){
        return this.creamCostForMl * this.creamMl;
    }

    @Override
    public String toString(){
        return "Description: " + getDescription()+
                "\nCost: " + getCost();
    }
}
