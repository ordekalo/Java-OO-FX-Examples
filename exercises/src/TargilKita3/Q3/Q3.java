package TargilKita3.Q3;// file: Q3.java

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {

        Dog[] a = new Dog[]{
                new Dog("Tony", false, "Poodel"),
                new Dog("Bulldogile", true, "Bulldog"),
                new Dog("Staffi", false, "Amstaf"),
                new Dog("Tony", false, "Rottweiler"),
                new Dog("Bulldogile", true, "Poodel")};


        System.out.println("Original array a:");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("\nAfter sorting:");
        System.out.println(Arrays.toString(a));


    }
}

