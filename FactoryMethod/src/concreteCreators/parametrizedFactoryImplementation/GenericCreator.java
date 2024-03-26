package concreteCreators.parametrizedFactoryImplementation;

import creators.TwoDimensionalFigureCreatorC;
import concreteProducts.Circle;
import products.TwoDimensionalFigure;

/**
 * Concrete creator that extends TwoDimensionalFigureCreatorC
 * and adds a new concrete product Circle to the parametrized
 * factory method.
 */
public class GenericCreator extends TwoDimensionalFigureCreatorC {
    public TwoDimensionalFigure createFigure(String figureName) throws Exception {
        if( figureName.equalsIgnoreCase("circle"))
            return new Circle();
        return super.createFigure(figureName);
    }

    public static void main(String[] args) throws Exception {

        (new GenericCreator()).view("circle");
    }

}
