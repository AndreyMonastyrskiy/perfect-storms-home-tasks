package module01.TASK_09;

public class ProgramTask94 {
    public static void main(String[] args) {
        System.out.println("Reversing string \"Programming\":");
        System.out.println(reverseString("Programming"));
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
