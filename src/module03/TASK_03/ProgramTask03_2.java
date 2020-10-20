package module03.TASK_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ProgramTask03_2 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(100_000_000L)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 128 * 1024));
        System.out.println("time = " + (b - a) / 1000);
    }

    public static long[] getNumbers(long N) {
        HashMap<Integer, long[]> powers = new HashMap<>();
        long[] result = {};
        int nLength = String.valueOf(N).length();

        // compute all powers
        for (int i = 1; i <= nLength; i++) {
            long[] elements = new long[10];
            for (int j = 0; j <= 9; j++) {
                elements[j] = (long)Math.pow(j, i);
            }
            powers.put(i, elements);
        }
        // find all armstrong numbers
        for (long i = 1; i < N; i++) {
            if (isArmstrongNumber(i, powers)) {
                result = addToLongArray(result, i);
            }
        }
        return result;
    }

    private static boolean isArmstrongNumber(long number, HashMap<Integer, long[]> powers) {
        ArrayList<Long> longDigits = new ArrayList<>();
        long sum = 0;
        // get separate numbers from input
        for (Character digit: String.valueOf(number).toCharArray()) {
            longDigits.add(Long.parseLong(digit.toString()));
        }
        // compute sum
        for (Long digit: longDigits) {
            sum += powers.get(longDigits.size())[digit.intValue()];
        }
        // check number
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
