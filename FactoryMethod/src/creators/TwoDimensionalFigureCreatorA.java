package creators;

import products.TwoDimensionalFigure;

public abstract class TwoDimensionalFigureCreatorA {
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
     * Abstract factory method that must be overrided in the concrete
     * creators subclasses
     * @return TwoDimensionalFigure
     */
    protected abstract TwoDimensionalFigure createFigure();

}
