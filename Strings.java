import java.util.*;
public class Strings {
    public static void main(String args[]) {
        //for characters:-
        char arr[]={'a','b','c','d'};
        //for strings there are two methods to apply:
        String str="abcd";
        String str2=new String("xyz");
        //Strings are immutable the changes cannot be done after the string is created.
        //We have to make another string to add changes in it.

        //Take input as string:-
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);

        //find length of string:-
        String fullName="Antara kanade";
        System.out.println(fullName.length());

        //concatenation= joining of two separate strings.
        String firstName="Antara";
        String lastName="Kanade";
        String finalName=firstName+" "+lastName;
        System.out.println(finalName);
        //If we want to check which letter is on which index:
        System.out.println(finalName.charAt(1));
        printLetters(finalName);
    }
    //If we want to print whole string:-
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}