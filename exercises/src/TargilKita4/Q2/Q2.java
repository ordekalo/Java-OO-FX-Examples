package TargilKita4.Q2;

public class Q2 {

    public static void main(String[] args) {
        Point<Integer> p1 = new Point<>(10, 20);
        distance(p1);

        Point<Double> p2 = new Point<>(3.0, 4.0);
        distance(p2);

    }

    public static void distance(Point<? extends Number> point) {
        double x_x = point.getX().doubleValue() * point.getX().doubleValue();
        double y_y = point.getY().doubleValue() * point.getY().doubleValue();
        double res = Math.sqrt(x_x + y_y);
        System.out.println(res);
    }

}
