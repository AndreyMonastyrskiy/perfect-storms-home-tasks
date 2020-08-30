package module01.TASK_08;

public class ProgramTask84 {
    public static void main(String[] args) {
        // Recursion is similar to the while cycle
        // The recursion can be executed indefinitely if the exit condition is incorrect.

        System.out.println(printRecursively(7));
        System.out.println(printRecursively(-9));
    }


    public static String printRecursively(int n) {
        if (n <= 0) {
            return "0";
        }
        return printRecursively(n - 1) + " " + n;
    }
}
