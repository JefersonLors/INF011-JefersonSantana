package creators;

import concreteProducts.Square;
import products.TwoDimensionalFigure;

public class TwoDimensionalFigureCreatorB {
    /**
     * Any operation that need an instance of TwoDimensionalFigure,
     * then calls the abstract factory method which must be
     * overrided in the concrete creator to provide then.
     */
    public void view(){
        TwoDimensionalFigure figure = this.createFigure();
        figure.setSize(10);
        figure.fill();
        System.out.println("type: " + figure.getTypeOfFigure());
        System.out.println("status: filled");
        System.out.println("size: " + figure.getSize());
        figure.draw();
        System.out.println();

        figure.setSize(20);
        figure.deflate();
        System.out.println("type: " + figure.getTypeOfFigure());
        System.out.println("status: deflated");
        System.out.println("size: " + figure.getSize());
        figure.draw();
    }

    /**
     * Factory method with default implementation that can be
     * overrided in the concrete creators subclasses to return others
     * concrete products.
     * @return TwoDimensionalFigure
     */
    public TwoDimensionalFigure createFigure(){
        return new Square();
    }

}
