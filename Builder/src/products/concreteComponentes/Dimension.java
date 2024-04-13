package products.concreteComponentes;

public class Dimension {
    private long height;
    private long width;
    private long length;

    public Dimension(long height, long width, long length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    public long getHeight() {
        return height;
    }

    public long getWidth() {
        return width;
    }

    public long getLength() {
        return length;
    }
}
