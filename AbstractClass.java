import java.util.*;

public class AbstractClass {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        // here we added color as dark brown in horse but as it inherits from abstract
        // class Animal it will give brown color to all subclasses.
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        // Here we cannot make object for abstract class Animal like Animal a=new
        // Animal(); because it will give error its not allowed in abstract class.
    }
}

abstract class Animal {
    String color;

    // here we can call constructor for abstract class:
    // This is initialized as color to all the subclasses same.
    Animal() {
        color = "brown";
    }

    // non-abstract function:
    void eat() {
        System.out.println("animal eats");
    }

    // abstract function:This is the function of abstract class here there is no
    // implementation or no sout with curly braces line it will be different for all
    // subclasses we makes.There should be implementation of walk() in each
    // subclass.
    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "dark Brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}