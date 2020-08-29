package module01.TASK_03;

public class ProgramTask35 {
    public static void main(String[] args) {
        // float type takes 32 bits of memory and can store values from 1.4e-45f to 3.4e+38f
        // double type takes 64 bits of memory and can store values from 4.9e-324 to 1.7e+308
        float a = 1245.554f;
        double b = 256.3785;
        System.out.println("Fractional part of a * b: " + (a * b - ((long) (a * b))));
    }
}
