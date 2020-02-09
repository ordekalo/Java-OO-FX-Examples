package TargilKita3.Q1;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }


    @Override
    public void say() {
        System.out.print("");
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + getName();
    }
}
