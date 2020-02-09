package TargilKita1.Q3;

public class Q3 {

    public static void main(String[] args) {
        Circle c = new Circle(1, 2, 3);
        System.out.println(c);

        c.setX(10);
        c.setY(20);
        c.setRadius(30);

        System.out.println(c);

        System.out.println(c.getArea());

    }

}
