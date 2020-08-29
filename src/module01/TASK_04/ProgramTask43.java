package module01.TASK_04;

public class ProgramTask43 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        a++; // a = 1
        b--; // b = 4
        System.out.println(a);
        System.out.println(b);
        a = --b; // Decrement b, then assign b to a. b = 3,  a = 3.
        System.out.println(a);
        System.out.println(b);
        a = b--; // Assign b to a, then decrement b. a = 3, b = 2.
        System.out.println(a);
        System.out.println(b);
        // Pre-increment run first and post-increment run last (after other operations).
    }
}
