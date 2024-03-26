package concreteProducts;

import products.TwoDimensionalFigure;

/**
 * Concrete product that interfaces TwoDimensionalFigure
 */
public class Circle implements TwoDimensionalFigure {
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
        return "circle";
    }

    @Override
    public void deflate() {
        this.isFilled = false;
    }

    @Override
    public void draw() {
        int ray = size;
        int diameter = ray * 2;
        double raioAoQuadrado = Math.pow(ray, 2);

        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                double distanciaAoCentro = Math.pow(i - ray, 2) + Math.pow(j - ray, 2);
                if (this.isFilled) {
                    if (distanciaAoCentro <= raioAoQuadrado) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if (Math.abs(distanciaAoCentro - raioAoQuadrado) < ray * 0.7) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
