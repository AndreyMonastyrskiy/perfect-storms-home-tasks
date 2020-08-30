package module01.TASK_08;

public class ProgramTask82 {
    public static void main(String[] args) {
        System.out.println("Check if the number 5 is greater than zero: " + isGraterZero(5));
        System.out.println("Check if the number -2 is greater than zero: " + isGraterZero(-2));
        System.out.println(sayIsGraterZero(0));
        System.out.println(sayIsGraterZero(8));
        System.out.println(sayIsGraterZero(-1));
        System.out.println(sayIsGraterZeroFull(0));
        System.out.println(sayIsGraterZeroFull(8));
        System.out.println(sayIsGraterZeroFull(-1));
    }

    public static boolean isGraterZero(int num) {
        if (num > 0) {
            return true;
        }
        return false;
    }

    public static String sayIsGraterZero(int num) {
        if (isGraterZero(num)) {
            return "number is greater than zero";
        }
        return "number is zero or less";
    }

    public static String sayIsGraterZeroFull(int num) {
        return sayIsGraterZero(num) + " and equal to " + num;
    }
}
