public class TypeCasting {
    public static void main(String args[]) {
        float marks = 99.9999f;
        int marks2 = (int) marks; // After this conversion from float to int there is DATA LOSS as the value will
                                  // execute only 99 and the numbers after the decimal will be removed.
        System.out.println(marks2);

    }
}
