package concreteProducts;

import products.TwoDimensionalFigureManipulator;

public class SquareManipulator implements TwoDimensionalFigureManipulator {
    private Square square;

    public SquareManipulator(Square square){
        this.square = square;
    }
    @Override
    public void cut() {
        System.out.println("cut " + square.getTypeOfFigure());
    }

    @Override
    public void extend() {
        System.out.println("extended " + square.getTypeOfFigure());
    }

    @Override
    public void reduce() {
        System.out.println("reduced " + square.getTypeOfFigure());
    }
}
