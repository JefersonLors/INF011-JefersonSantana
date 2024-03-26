package creators;

import products.TwoDimensionalFigure;
import products.TwoDimensionalFigureManipulator;

public abstract class TwoDimensionalFigureCreatorD {
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
     * Abstract factory method which instance the concrete product and
     * that must be overrided in the concrete creators subclasses.
     * @return TwoDimensionalFigure
     */
    public abstract TwoDimensionalFigure createFigure();

    /**
     * Abstract factory method which instance the concrete manipulator of
     * the product and that must be overrided in the concrete creators subclasses
     * @return TwoDimensionalFigureManipulator
     */
    public abstract TwoDimensionalFigureManipulator createManipulator();

}
