package concreteCreators.parallelClassesHierarchyImplementation;

import concreteProducts.Square;
import concreteProducts.SquareManipulator;
import creators.TwoDimensionalFigureCreatorD;
import products.TwoDimensionalFigure;
import products.TwoDimensionalFigureManipulator;

public class SquareCreator extends TwoDimensionalFigureCreatorD {
    private final Square square = new Square();
    @Override
    public TwoDimensionalFigure createFigure() {
        return square;
    }

    @Override
    public TwoDimensionalFigureManipulator createManipulator() {
        return new SquareManipulator(square);
    }
}
