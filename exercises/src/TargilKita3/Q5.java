package TargilKita3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q5 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the file's path & name: ");
        String fname = s.nextLine();
        try (PrintWriter pw = openFile(fname)) {
            int n = getNumberStudent();
            stduentsToFile(pw, n);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nProgram ends now...");
    }

    public static void stduentsToFile(PrintWriter pw, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("\nPlease enter name for student #" + (i + 1) + ": ");
            String name = s.nextLine();
            System.out.print("Please enter grade for student #" + (i + 1) + ": ");
            try {
                int grade = Integer.parseInt(s.nextLine());
                Student tmp = new Student(name, grade);
                pw.println(tmp);
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input... an integer value is needed...");
                i--;
            } catch (GradeException e) {
                System.out.println(e.getMessage());
                i--;
            }

        }
    }

    public static int getNumberStudent() {
        boolean flag = true;
        int n = 0;
        while (flag) {
            try {
                System.out.println("Please enter the number of students: ");
                n = Integer.parseInt(s.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input... an integer value is needed...");
            }
        }
        return n;
    }

    public static PrintWriter openFile(String fname) throws FileNotFoundException {
        return new PrintWriter(fname);
    }

}
