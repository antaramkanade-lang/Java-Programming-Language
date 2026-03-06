import java.util.*;

public class ClassesAndObjectsInOOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // Created a pen object called p1 using new keyword.
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        // if we want to change color:
        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    // properties:
    String color;
    int tip;

    // functions:
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
