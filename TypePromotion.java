public class TypePromotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        System.out.println(b - a); // Java automatically converted a and b into int just because we did subtraction
                                   // between a and b so b=98 and a=97 it will give ans 1.
        int g = 10;
        float h = 20.25f;
        long c = 25;
        double d = 30;
        double ans = g + h + c + d; // It will convert all the value to double and the ans will also come in double
                                    // because double is bigger in all.
        System.out.println(ans);
    }
}
