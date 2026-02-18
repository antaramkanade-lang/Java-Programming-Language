import java.util.*;

//In java the function can also called as methods.
public class FunctionsORMethods {
    public static void printHelloWorld() { // This is a new function or method.
        // If we use int here as return Type then we need to use return 3;
        // as we want 3 times to print hello world.
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return; // If we use void return Type then its our choice to write return or not.
    }

    public staic void main(String args[]) {
        printHelloWorld();//Here we need to call the function to execute.
    }
}
