package module01.TASK_08;

public class ProgramTask83 {
    public static void main(String[] args) {
        // Method Overloading is a feature that allows a class to have more than one method having the same name,
        // if their argument lists are different.
        // In order to overload a method, the argument lists of the methods must differ in either of these:
        // 1. Number of parameters.
        // 2. Data type of parameters.
        // 3. Sequence of Data type of parameters.

        // "public static void sum(int a, double b)" isn't overload "public static double sum(int a, double b)"
        // "public static double sum(double a, int b)" is overload "public static double sum(int a, double b)"

        printWithSpaces(7);
        printWithSpaces(6, -3);
        printWithSpaces(5.3, 1);
        printWithSpaces(1.7, 4.7);
        printWithSpaces(new int[] {1, 3, 2, 4});
    }

    public static void printWithSpaces(int num) {
        System.out.println(num + " ");
    }

    public static void printWithSpaces(int num, int num2) {
        System.out.println(num + " " + num2 + " ");
    }

    public static void printWithSpaces(double num, int num2) {
        System.out.println(num + " " + num2 + " ");
    }

    public static void printWithSpaces(double num, double num2) {
        System.out.println(num + " " + num2 + " ");
    }

    public static void printWithSpaces(int[] numbs) {
        String result = "";
        for (int i = 0; i < numbs.length; i++) {
            result += numbs[i] + " ";
        }
        System.out.println(result);
    }
}
