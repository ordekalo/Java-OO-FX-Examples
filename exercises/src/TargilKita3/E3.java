package TargilKita3;

import java.util.Scanner;

public class E3 {

    private static final int MIN = -5;
    private static final int MAX = 10;
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        int res = 0;
        while (flag) {
            System.out.print("\nPlease enter an integer value, in the range of " + MIN + " to " + MAX + " :");
            int n = Integer.parseInt(s.nextLine());
            try {
                res = range(n);
                flag = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("res = " + res);

    }

    public static int range(int n) throws IllegalArgumentException {
        if (n < MIN || n > MAX)
            throw new IllegalArgumentException("The input is out of range...");
        int sum = 0;
        for (int i = MIN; i <= n; i++)
            sum += i;
        return sum;
    }

}
