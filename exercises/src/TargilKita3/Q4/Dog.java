package TargilKita3.Q4;

public class Dog extends Animal implements Comparable<Dog>, Cloneable {
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

    public int compareTo(Dog anotherDog) {
        // Compare by names
        int comp = getName().compareTo(anotherDog.getName());
        // If both have the same name compare by type
        return comp == 0 ? getType().compareTo(anotherDog.getType()) : comp;
    }

    @Override
    public boolean isDangerous() {
        final String[] DAN_ARR = {"Rottweiler", "Amstaf", "Bulldog"};
        for (String s : DAN_ARR)
            if (s.equals(getType()))
                return true;
        return false;
    }

    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }
}
