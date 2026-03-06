import java.util.*;

public class GettersSetters {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        p1.setTip(6);
        System.out.println(p1.getTip());
    }
}

class Pen {
    // So now if the color and tip are private then also we can access and print
    // them through main method.
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}
