import java.util.*;

public class StaticKeyword {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.schoolName = "ABC";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName = "FGH";
        System.out.println(s2.schoolName);
        System.out.println(Student.percent(34, 56, 76));
    }
}

class Student {
    String name;
    int roll;

    // here static means fix or one single value for all the objects declared for
    // Student.It means if we change something in any object then it will apply to
    // all the objects.
    static int percent(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName(String name) {
        return this.name;
    }
}
