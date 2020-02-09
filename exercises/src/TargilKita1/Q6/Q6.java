package TargilKita1.Q6;

import java.util.ArrayList;

public class Q6 {

    public static void main(String[] args) {
        ArrayList<Object> a = new ArrayList<>();
        a.add(new Student("Avi", 88));
        a.add(new Square(10));
        a.add(new Square(20));
        a.add(new Student("Shimi", 95));
        a.add(new Square(30));

        for (Object o : a) System.out.println(o);

    }

}
