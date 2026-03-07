import java.util.*;

public class HierarchicalInheritance {
    public static void main(String args[]) {
        Bird crow = new Bird();
        crow.eat();
        crow.fly();
        crow.legs = 2;
        System.out.println(crow.legs);
    }
}

class Animal {
    String color;
    int legs;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flies");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}