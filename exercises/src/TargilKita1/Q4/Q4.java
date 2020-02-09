package TargilKita1.Q4;

public class Q4 {

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);

        System.out.println(p1);
        System.out.println(p2);
        if (p1.equals(p2))
            System.out.println("p1 equals p2");
        else
            System.out.println("p1 NOT equals p2");

        ColorPoint cp1 = new ColorPoint(10, 20, "Red");
        ColorPoint cp2 = new ColorPoint(10, 20, "rED");
        System.out.println(cp1);
        System.out.println(cp2);

        if (cp1.equals(cp2))
            System.out.println("cp1 equals cp2");
        else
            System.out.println("cp1 NOT equals cp2");

        if (p1.equals(cp2))
            System.out.println("p1 equals cp2");
        else
            System.out.println("p1 NOT equals cp2");


        if (cp1.equals(p2))
            System.out.println("cp1 equals p2");
        else
            System.out.println("cp1 NOT equals p2");

    }

}
