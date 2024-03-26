package concreteCreators.parallelClassesHierarchyImplementation;

import concreteProducts.Triangle;
import concreteProducts.TriangleManipulator;
import creators.TwoDimensionalFigureCreatorD;
import products.TwoDimensionalFigure;
import products.TwoDimensionalFigureManipulator;

public class TriangleCreator extends TwoDimensionalFigureCreatorD {
    private final Triangle triangle = new Triangle();
    @Override
    public TwoDimensionalFigure createFigure() {
        return triangle;
    }

    @Override
    public TwoDimensionalFigureManipulator createManipulator() {
        return new TriangleManipulator(triangle);
    }
}
