package module03.TASK_03;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramTask03_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNumbers(1000)));
    }

    public static long[] getNumbers(long N) {
        long[] result = {};
        for (long i = 1; i < N; i++) {
            if (isArmstrongNumber(i)) {
                result = addToLongArray(result, i);
            }
        }
        return result;
    }

    private static boolean isArmstrongNumber(long number) {
        ArrayList<Byte> longDigits = new ArrayList<>();
        long sum = 0;

        for (Character digit: String.valueOf(number).toCharArray()) {
            longDigits.add(Byte.parseByte(digit.toString()));
        }

        for (Byte digit: longDigits) {
            sum += Math.pow(digit, longDigits.size());
        }

        if (sum == number) {
            return true;
        }
        return false;
    }

    private static long[] addToLongArray(long[] array, long item) {
        long[] result = new long[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        result[result.length - 1] = item;
        return result;
    }

}
