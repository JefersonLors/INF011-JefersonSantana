package creators;

import concreteProducts.Square;
import concreteProducts.Triangle;
import products.TwoDimensionalFigure;

public class TwoDimensionalFigureCreatorC {
    /**
     * Any operation that need an instance of TwoDimensionalFigure,
     * then calls the abstract factory method which must be
     * overrided in the concrete creator to provide then.
     */
    public void view(String figureName) throws Exception {
        TwoDimensionalFigure figure = this.createFigure(figureName);
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
     * Parametrized factory method which receive the name
     * of the which one concrete product  the must be factored.
     * @return TwoDimensionalFigure
     */
    public TwoDimensionalFigure createFigure(String figureName) throws Exception {
        if( figureName.equalsIgnoreCase("square"))
            return new Square();
        if( figureName.equalsIgnoreCase("triangle"))
            return new Triangle();
        throw new Exception(figureName + " is a two dimensional figure is unknown");
    }

}
