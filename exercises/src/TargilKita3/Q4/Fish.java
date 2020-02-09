package TargilKita3.Q4;

public class Fish extends Animal {
    public Fish(String name, String type) {
        super(name, type);
    }


    @Override
    public void say() {
        System.out.print("");
    }


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + getName() + " (type: " + getType() + ")";
    }

    @Override
    public boolean isDangerous() {
        final String[] DAN_ARR = {"Shark", "Whale"};
        for (String s : DAN_ARR)
            if (s.equals(getType()))
                return true;
        return false;
    }
}
