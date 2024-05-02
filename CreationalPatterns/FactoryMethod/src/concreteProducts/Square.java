package concreteProducts;

import products.TwoDimensionalFigure;

/**
 * Concrete product that interfaces TwoDimensionalFigure
 */
public class Square implements TwoDimensionalFigure {
    private int size;
    private boolean isFilled = false;
    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void fill() {
        this.isFilled = true;
    }

    @Override
    public String getTypeOfFigure() {
        return "square";
    }

    @Override
    public void deflate() {
        this.isFilled = false;
    }

    @Override
    public void draw() {
        int height = size/2;
        int width = size;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("*");
                } else if (isFilled) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
