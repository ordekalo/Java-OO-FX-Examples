package TargilKita3.Q1;

public class Cat extends Animal {
    public Cat(String name, boolean sleep) {
        super(name, sleep);
    }


    @Override
    public void say() {
        if (!isSleep())
            System.out.println("Miahoo, Miahoo");
        else
            System.out.println("..Shhh .. the cat is sleeping now.");
    }
}
