package TargilKita4.Q3;

public class Q3 {

    public static void main(String[] args) {
        Point<Integer> p1 = new Point<>(10, 20);
        Double[] a = {1.0, 2.2, 10.0, 3.1};
        boolean res = isXExistsInArray(a, p1);
        System.out.println(res);

    }

    public static <T extends Number> boolean isXExistsInArray(T[] a, Point<? extends Number> p) {
        for (T t : a)
            if (t.doubleValue() == p.getX().doubleValue())
                return true;

        return false;
    }

}
