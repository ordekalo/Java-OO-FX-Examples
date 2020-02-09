package TargilKita1.Q5;

public class Q5 {

    public static void main(String[] args) {
        Rect r = new Rect();
        r.setWidth(10);
        r.setLen(20);
        System.out.println("Rect area = " + r.area());

        Box box = new Box(1, 2, 1);
        System.out.println("Box area = " + box.area());

        int d = diff(r, box);
        System.out.println(d);

        d = diff(box, r);
        System.out.println(d);

        d = diff(box, box);
        System.out.println(d);
    }

    public static int diff(Rect r1, Rect r2) {
        return r1.area() - r2.area();
    }

}
