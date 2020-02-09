package TargilKita1.Q5;

public class Box extends Rect {
    private int height;

    public Box(int width, int len, int height) {
        setWidth(width);
        setLen(len);
        this.height = height;
    }

    @Override
    public int area() {
        return 2 * (getWidth() * height + super.area() + height * super.area() / getWidth());
    }
}
