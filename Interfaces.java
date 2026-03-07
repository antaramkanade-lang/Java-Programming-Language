import java.util.*;

public class Interfaces {
    public static void main(String args[]) {
        Rook r1 = new Rook();
        r1.moves();
        Bear b = new Bear();
        b.eat();
        b.hunt();
    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal - in all directions");
    }
}

class Rook implements chessPlayer {
    public void moves() {
        System.out.println("up, down, right, left");
    }
}

class King implements chessPlayer {
    public void moves() {
        System.out.println("up, down, right, left, diagonal - in all directions");
    }
}

// Apply multiple inheritance using interfaces:
interface Herbivore {
    void eat();
}

interface Carnivore {
    void hunt();
}

class Bear implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("eats green grass");
    }

    public void hunt() {
        System.out.println("hunt down animals and also eats meat");
    }
}
