package module01.TASK_08;

public class ProgramTask81 {
    public static void main(String[] args) {
        displayNumbers();
        printFromOneTo(7);
        printFromToDivisible(13, 45);
        if (isTrianglePossible(12, 7, 8)) {
            System.out.println("Such a triangle is possible");
        } else {
            System.out.println("Such a triangle is not possible");
        }
    }

    public static void displayNumbers() {
        String result = "";
        for (int i = 1; i <= 20 ; i++) {
            if(i % 2 == 0) {
                result = i + " "  + result;
            } else {
                result += i + " ";
            }
        }
        System.out.println(result);
    }

    public static void printFromOneTo(int to) {
        for (int i = 1; i <= to; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printFromToDivisible(int from, int to) {
        for (int i = from; i <= to; i++) {
            if(i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isTrianglePossible(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            return true;
        }
        return false;
    }
}
