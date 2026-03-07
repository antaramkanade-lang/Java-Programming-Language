import java.util.*;

public class SuperKeyword {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        // through this super keyword we are able to access the properties of our
        // immediate base class Animal.
        super.color = "brown";
        System.out.println("Horse constructor is called");
    }
}
