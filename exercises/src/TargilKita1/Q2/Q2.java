package TargilKita1.Q2;

public class Q2 {

    public static void main(String[] args) {
        Rect r = new Rect();
        r.setWidth(10);
        r.setLen(20);
        System.out.println("Rect area = " + r.area());

        Box box = new Box(1, 2, 1);
        System.out.println("Box area = " + box.area());
    }

}
