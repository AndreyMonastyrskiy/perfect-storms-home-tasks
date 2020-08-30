package module01.TASK_05;

public class ProgramTask53 {
    public static void main(String[] args) {
        int a = 34;
        int b = 2;
        int c = 78;
        int maximum = 0;
        int minimum = 0;

        // Finding maximum
        if (a > b ) {
            if (a > c) {
                maximum = a;
            } else {
                maximum = c;
            }
        } else {
            if (b > c) {
                maximum = b;
            } else {
                maximum = c;
            }
        }
        // Finding minimum
        if (a < b) {
            if (a < c) {
                minimum = a;
            } else {
                minimum = c;
            }
        } else {
            if (b < c) {
                minimum = b;
            } else {
                minimum = c;
            }
        }

        System.out.println(String.format("Maximum: %d, Minimum %d.", maximum, minimum));

    }
}
