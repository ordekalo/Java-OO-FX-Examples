package TargilKita1.Q1;

public class Student extends Person {
    private int grade;

    public Student(String name, int id, int grade) {
        super(name, id);
        this.grade = grade;

    }

    @Override
    public String toString() {
        return getName() + ", " + super.getId() + ", " + grade;
    }

}
