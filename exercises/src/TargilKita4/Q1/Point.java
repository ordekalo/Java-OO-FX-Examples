package TargilKita4.Q1;

public class Point<T extends Number> {
    private T x;
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    @Override
    public String toString() {
        return "( " + x + ", " + y + " )";
    }

}
