package concreteProducts;

import products.TwoDimensionalFigureManipulator;

public class TriangleManipulator implements TwoDimensionalFigureManipulator {
    private final Triangle triangle;

    public TriangleManipulator(Triangle triangle){
        this.triangle = triangle;
    }
    @Override
    public void cut() {
        System.out.println("cut " + this.triangle.getTypeOfFigure());
    }

    @Override
    public void extend() {
        System.out.println("extended "+ this.triangle.getTypeOfFigure());
    }

    @Override
    public void reduce() {
        System.out.println("reduced " + this.triangle.getTypeOfFigure());
    }
}
