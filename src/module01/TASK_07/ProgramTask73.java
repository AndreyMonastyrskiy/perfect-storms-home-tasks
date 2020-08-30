package module01.TASK_07;

public class ProgramTask73 {
    public static void main(String[] args) {
        int[] array = { 10, 20, 15, 17, 24, 35 };
        int mul = array[0];

        for (int i = 1; i < array.length; i++) {
            mul *= array[i];
        }

        System.out.println(mul);
    }
}
