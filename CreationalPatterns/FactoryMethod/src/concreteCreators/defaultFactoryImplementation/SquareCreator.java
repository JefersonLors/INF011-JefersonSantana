package concreteCreators.defaultFactoryImplementation;

import creators.TwoDimensionalFigureCreatorA;
import concreteProducts.Square;
import products.TwoDimensionalFigure;

/**
 * Concrete creator which overrides the factory method
 * to return the concrete product Square to be manipulated
 * by the creator class base.
 */
public class SquareCreator extends TwoDimensionalFigureCreatorA {
    @Override
    protected TwoDimensionalFigure createFigure() {
        return new Square();
    }

    public static void main(String[] args) {
        (new SquareCreator()).view();
    }
}
