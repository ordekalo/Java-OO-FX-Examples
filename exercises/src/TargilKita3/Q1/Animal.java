package TargilKita3.Q1;

public abstract class Animal {
    private String name;
    private boolean sleep;

    public Animal(String name, boolean sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSleep() {
        return sleep;
    }

    public abstract void say();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + name + (sleep ? ", Sleeping..." : ", Awake!");
    }
}
