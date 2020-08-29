package module01.TASK_04;

public class ProgramTask47 {
    public static void main(String[] args) {
        int a = 10;
        a <<= 1;
        System.out.println(a);
        a >>= 2;
        System.out.println(a);
        a = -5;
        a >>>= 1;
        System.out.println(a);
        // The operator >> during the shift does not affect the first bit, which defines a positive or negative number.
        // The operator >>> during the shift affect the first bit, which defines a positive or negative number.
    }
}
