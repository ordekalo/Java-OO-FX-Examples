package TargilKita3.Q1;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\n" + name + ", " + grade;
    }

}
