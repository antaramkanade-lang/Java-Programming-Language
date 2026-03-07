import java.util.*;

public class Inheritance {
    public static void main(String args[]) {
        Fish shark = new Fish();
        // eat and breathe are the functions declared in Animal but due to extend fish
        // can also use them.
        shark.eat();
        shark.breathe();
    }
}

class Animal {
    // properties:
    String skinColor;

    // Functions:
    void breathe() {
        System.out.println("breathes");
    }

    void eat() {
        System.out.println("eats");
    }
}

// Here extends use to inherit the properties and functions of Animal to fish.
class Fish extends Animal {
    // properties:
    int fins;

    // functions:
    void swim() {
        System.out.println("swims");
    }
}