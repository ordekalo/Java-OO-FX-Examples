package TargilKita3;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) throws GradeException {
        this.name = name;
        if (grade < 0 || grade > 100)
            throw new GradeException("\nGrade must be from 0 to 100!");
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ", " + grade;
    }

}
