package TargilKita4.Q4;

public class IntegerPoint extends Point<Integer> {

    public IntegerPoint(int x, int y) {
        super(x, y);
    }

    public void add(int delta) {
        setX(getX() + delta);
        setY(getY() + delta);
    }

}
