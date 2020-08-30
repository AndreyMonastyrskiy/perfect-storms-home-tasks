package module01.TASK_06;

import java.util.Arrays;

public class ProgramTask62 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[9 - i] = array[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}
