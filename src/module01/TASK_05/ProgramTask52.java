package module01.TASK_05;

public class ProgramTask52 {
    public static void main(String[] args) {
        int c = 3, d = 2;

        if (c == d++) { // 3 != 2 -> false
            System.out.println("It is 'if' statement!");
        } else {
            System.out.println("It is 'else' statement!");
        }
        // "It is 'else' statement!" - will be displayed
    }
}
