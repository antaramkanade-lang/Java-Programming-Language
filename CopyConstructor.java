import java.util.*;

public class CopyConstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Antara";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 99;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Copy constructor:
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student() {
        marks = new int[3];
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
    // Here we cannot write this because constructors cannot have same types of
    // parameters. Like here both name and pass are strings.
    // Student(String password) {
    // this.password = password;
}
