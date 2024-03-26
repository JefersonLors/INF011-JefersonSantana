package concreteProducts;

import products.TwoDimensionalFigureManipulator;

public class CircleManipulator implements TwoDimensionalFigureManipulator {
    private Circle circle;

    public CircleManipulator(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void cut() {
        System.out.println("cut " + circle.getTypeOfFigure());
    }

    @Override
    public void extend() {
        System.out.println("extended " + circle.getTypeOfFigure());
    }

    @Override
    public void reduce() {
        System.out.println("reduced " + circle.getTypeOfFigure());
    }
}
