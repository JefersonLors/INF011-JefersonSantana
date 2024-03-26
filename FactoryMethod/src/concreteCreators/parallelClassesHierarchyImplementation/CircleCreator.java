package concreteCreators.parallelClassesHierarchyImplementation;

import concreteProducts.Circle;
import concreteProducts.CircleManipulator;
import concreteProducts.Square;
import concreteProducts.SquareManipulator;
import creators.TwoDimensionalFigureCreatorD;
import products.TwoDimensionalFigure;
import products.TwoDimensionalFigureManipulator;

public class CircleCreator extends TwoDimensionalFigureCreatorD {
    private final Circle circle = new Circle();
    @Override
    public TwoDimensionalFigure createFigure() {
        return circle;
    }

    @Override
    public TwoDimensionalFigureManipulator createManipulator() {
        return new CircleManipulator(circle);
    }
}
