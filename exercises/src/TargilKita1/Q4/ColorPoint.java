package TargilKita1.Q4;

public class ColorPoint extends Point {
    private String color;

    public ColorPoint(float x, float y, String color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && color.equalsIgnoreCase(((ColorPoint) obj).color);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }

}
