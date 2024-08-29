package Originator;

public interface Originator<M> {
    M checkpoint();
    void restore(M snapshot);
}
