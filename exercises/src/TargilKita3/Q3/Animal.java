package TargilKita3.Q3;

public abstract class Animal implements Dangerous {
    private String name;
    private boolean sleep;
    private String type;

    public Animal(String name, boolean sleep, String type) {
        this.name = name;
        this.sleep = sleep;
        this.type = type;
    }

    public Animal(String name, boolean sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isSleep() {
        return sleep;
    }

    public String getType() {
        return type;
    }

    public abstract void say();

    @Override
    public String toString() {
        String t = " (type: " + type + ")";
        if (type == null)
            t = "";
        return "\n" + this.getClass().getSimpleName() + ": " + name + (sleep ? ", Sleeping..." : ", Awake!") + t;
    }
}
