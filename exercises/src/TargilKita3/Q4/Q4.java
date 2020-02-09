package TargilKita3.Q4;

public class Q4 {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Tony", false, "Poodel");
        Dog dog2;
        try {
            dog2 = dog1.clone();
            System.out.println(dog1);
            System.out.println(dog2);

            // Changes the type of the first dog to a new type
            dog1.setType("Amstaf");

            // Prints both of them again
            System.out.println("\nAfter setType:");
            System.out.println(dog1);
            System.out.println(dog2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
