import java.util.*;

public class HybridInheritance {
    public static void main(String args[]) {
        Tuna f1 = new Tuna();
        f1.swim();
        f1.fins = 2;
        System.out.println(f1.fins);
        f1.poisons();
        f1.breathe();
    }
}

class Animal {
    String color;
    int legs;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims");
    }
}

class Tuna extends Fish {
    void poisons() {
        System.out.println("poisonous");
    }
}

class Shark extends Fish {
    void bites() {
        System.out.println("bites to death");
    }
}

class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("flies");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("dances");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Human extends Mammal {
    void move() {
        System.out.println("Do movements");
    }
}