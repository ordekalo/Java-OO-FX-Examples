package TargilKita3.Q2;

import java.util.Scanner;

public class Q2 {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        System.out.print("Please enter the student's name: ");
        String name = s.nextLine();

        System.out.print("Please enter the student's grade: ");
        while (flag) {
            try {
                int grade = Integer.parseInt(s.nextLine());
                Student stu = new Student(name, grade);
                System.out.println(stu);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("\nThe grade has to be an integer...");
                System.out.println("Please reenter the grade:");
            }
        }

    }

}
