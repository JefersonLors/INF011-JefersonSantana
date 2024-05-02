package concreteProducts;

import products.TwoDimensionalFigure;

/**
 * Concrete product that interfaces TwoDimensionalFigure
 */
public class Triangle implements TwoDimensionalFigure {
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
        return "triangle";
    }

    @Override
    public void deflate() {
        this.isFilled = false;
    }

    @Override
    public void draw() {
        int height = size;
        int initialsSpaces = size;

        if (this.isFilled) {
            for (int linha = 0; linha < height; linha++) {
                for (int i = 0; i < initialsSpaces; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < (2 * linha) + 1; i++) {
                    System.out.print("*");
                }
                System.out.println();
                initialsSpaces--;
            }
        } else {
            for (int linha = 0; linha < height; linha++) {
                for (int i = 0; i < initialsSpaces; i++) {
                    System.out.print(" ");
                }
                if (linha == 0 || linha == height - 1) {
                    for (int i = 0; i < (2 * linha) + 1; i++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                    for (int i = 0; i < (2 * linha) - 1; i++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
                initialsSpaces--;
            }
        }
    }

}
