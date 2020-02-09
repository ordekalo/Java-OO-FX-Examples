package TargilKita3.Q1;

public class Dog extends Animal {
    public Dog(String name, boolean sleep) {
        super(name, sleep);
    }


    @Override
    public void say() {
        if (!isSleep())
            System.out.println("Hav, Hav");
        else
            System.out.println("..Shhh .. the dog is sleeping now.");
    }
}
