package module03.TASK_03;

/**
 * Armstrong numbers searcher for Long.MAX_VALUE
 *
 * Optimization of runtime and memory usage is needed
 *
 * @author Andrey Monastyrskiy
 */

import java.util.*;

public class ProgramTask03_3 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(Long.MAX_VALUE)));
        long b = System.currentTimeMillis();
        System.out.println("memory " +
                (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 128 * 1024));
        System.out.println("time = " + (b - a) / 1000);

    }

    private static Long[] getNumbers(long number) {
        TreeSet<Long> result = new TreeSet<>();
        int numberLength = String.valueOf(number).length();
        Long[] cache = new Long[numberLength];
        HashMap<Integer, long[]> powers = new HashMap<>();

        // fill cache with 9 numbers
        for (int i = 0; i < numberLength; i++) {
            cache[i] = 9L;
        }

        // compute all powers
        for (int i = 1; i <= 19; i++) {
            long[] elements = new long[10];
            for (int j = 0; j <= 9; j++) {
                elements[j] = (long)Math.pow(j, i);
            }
            powers.put(i, elements);
        }

        do {
            // check current unique number
            Long[] arrayNumber = cache.clone();
            // delete first zero until no one exist
            while (arrayNumber[0] == 0) {
                long sum = 0;
                for (Long digit: arrayNumber) {
                    sum += powers.get(arrayNumber.length)[digit.intValue()];
                }
                // delete first zero
                arrayNumber = Arrays.copyOfRange(arrayNumber, 1, arrayNumber.length);

                if (sum > number) { continue; }

                // check number
                if (isArmstrongNumber(sum, powers)) {
                    result.add(sum);
                }
            }

            // compute power of the sum of numbers
            long sum = 0;
            for (Long digit: arrayNumber) {
                sum += powers.get(arrayNumber.length)[digit.intValue()];
            }
            if (sum > number) { continue; }

            // check number
            if (isArmstrongNumber(sum, powers)) {
                result.add(sum);
            }

            // get next number
            if (cache[0] == 0) {
                for (int i = 0; i < numberLength; i++) {
                    if (cache[i] != 0) {
                        cache[i] = cache[i] - 1;
                        for (int j = 0; j < i; j++) {
                            cache[j] = cache[i];
                        }
                        break;
                    }
                }
            } else {
                cache[0] = cache[0] - 1;
            }
        } while (cache[numberLength - 1] != 0);

        return result.toArray(new Long[0]);
    }

    private static boolean isArmstrongNumber(long number, HashMap<Integer, long[]> powers) {
        ArrayList<Long> longDigits = new ArrayList<>();
        long sum = 0;

        if (number <= 0) { return false; }

        // get separate numbers from input
        for (Character digit: String.valueOf(number).toCharArray()) {
            longDigits.add(Long.parseLong(digit.toString()));
        }

        // compute sum
        for (Long digit: longDigits) {
            long[] x = powers.get(longDigits.size());
            int z = (int) x[digit.intValue()];
            sum += powers.get(longDigits.size())[digit.intValue()];
        }

        // check number
        if (sum == number) {
            return true;
        }
        return false;
    }
}
