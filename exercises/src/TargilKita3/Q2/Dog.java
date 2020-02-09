package TargilKita3.Q2;

public class Dog extends Animal {
    public Dog(String name, boolean sleep, String type) {
        super(name, sleep, type);
    }

    @Override
    public void say() {
        if (!isSleep())
            System.out.println("Hav, Hav");
        else
            System.out.println("..Shhh .. the dog is sleeping now.");
    }

    @Override
    public boolean isDangerous() {
        final String[] DAN_ARR = {"Rottweiler", "Amstaf", "Bulldog"};
        for (String s : DAN_ARR)
            if (s.equals(getType()))
                return true;
        return false;
    }
}
