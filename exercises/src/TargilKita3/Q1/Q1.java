package TargilKita3.Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the student's name: ");
        String name = s.nextLine();

        System.out.print("Please enter the student's grade: ");
        try {
            int grade = s.nextInt();
            Student stu = new Student(name, grade);
            System.out.println(stu);
        } catch (InputMismatchException e) {
            System.out.println("\nThe grade has to be an integer...");
            System.out.println("Program ends now...");
        }

    }

}
