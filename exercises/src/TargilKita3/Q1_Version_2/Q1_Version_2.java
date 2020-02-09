package TargilKita3.Q1_Version_2;

import java.util.Scanner;

public class Q1_Version_2 {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the student's name: ");
        String name = s.nextLine();

        System.out.print("Please enter the student's grade: ");
        try {
            int grade = Integer.parseInt(s.nextLine());
            Student stu = new Student(name, grade);
            System.out.println(stu);
        } catch (NumberFormatException e) {
            System.out.println("\nThe grade has to be an integer...");
            System.out.println("Program ends now...");
        }

    }

}
