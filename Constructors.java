import java.util.*;

public class Constructors {
    public static void main(String args[]) {
        Student s1 = new Student("Antara");
        System.out.println(s1.name);
        Pen p1 = new Pen(); // Print the statement written in the constructor Pen.
    }
}

class Student {
    String name;
    int roll;

    // Parameterized Constructor called:
    Student(String name) {
        this.name = name;
    }
}

// Or we can also use constructors like:
class Pen {
    String color;
    int tip;

    // Non-Parameterized constructor:
    Pen() {
        System.out.println("Constructor is called...");
    }
}
