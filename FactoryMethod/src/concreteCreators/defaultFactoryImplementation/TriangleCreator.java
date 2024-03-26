package concreteCreators.defaultFactoryImplementation;

import creators.TwoDimensionalFigureCreatorA;
import concreteProducts.Triangle;
import products.TwoDimensionalFigure;

/**
 * Concrete creator which overrides the factory method
 * to return the concrete product Triangle to be manipulated
 * by the creator class base.
 */

public class TriangleCreator extends TwoDimensionalFigureCreatorA {
    @Override
    protected TwoDimensionalFigure createFigure() {
        return new Triangle();
    }

    public static void main(String[] args) {
        (new TriangleCreator()).view();
    }
}
