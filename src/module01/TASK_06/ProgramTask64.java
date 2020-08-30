package module01.TASK_06;

import java.util.Arrays;

public class ProgramTask64 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        swap(array, 1, 2);
        swap(array, 1, 3);
        swap(array, -1, 0);

        int[] array2 = new int[] {2, 4, 6, 8, 10};
        swap(array2, 2, 3);
        swap(array2, 4, 5);
        swap(array2, -2, 0);
    }

    private static void swap(int[] array, int indexA, int indexB) {
        System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indexA + " and " + indexB);

        if (indexA < 0 || indexA > array.length - 1) {
            System.out.println(String.format("IndexA (%d) incorrect!", indexA));
            return;
        }
        if (indexB < 0 ||  indexB > array.length - 1) {
            System.out.println(String.format("IndexB (%d) incorrect!", indexB));
            return;
        }

        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;

        System.out.println("Result: " + Arrays.toString(array) + "\n");
    }
}
