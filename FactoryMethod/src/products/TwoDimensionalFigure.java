package products;

/**
 * Product interface that will be used to
 * create concrete products for the creators
 */
public interface TwoDimensionalFigure {
    void setSize(int size);
    int getSize();
    void fill();
    String getTypeOfFigure();
    void deflate();
    void draw();
}
