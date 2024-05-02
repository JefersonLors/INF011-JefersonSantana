package concreteCreators.factoryDefaultImplementation;

import creators.TwoDimensionalFigureCreatorB;
import concreteProducts.Triangle;
import products.TwoDimensionalFigure;

/**
 * Concrete creator that extends TwoDimensionalFigureCreatorB
 * and uses the default implementation of the factory method
 * provided by the base creator class
 */

public class GenericCreator extends TwoDimensionalFigureCreatorB {

    public static void main(String[] args) {
        (new GenericCreator()).view();
    }

}
