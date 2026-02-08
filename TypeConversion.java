public class TypeConversion {
    public static void main(String args[]) {
        int a = 25;
        float b = a; // Here int can be converted in float but float cannot be converted into int.
        System.out.println(b);

        char ch = 'a';
        char ch2 = 'b';
        int num = ch; // It will give the value of a = 97.
        int num2 = ch2; // It will give value of b= 98.
        System.out.println(num);
        System.out.println(num2);
    }
}
