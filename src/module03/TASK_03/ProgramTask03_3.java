package module03.TASK_03;

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
        ArrayList<Long[]> uniqueNumbers = getUniqueNumbers(number);
        HashMap<Integer, long[]> powers = new HashMap<>();

        // compute all powers
        for (int i = 1; i <= 19; i++) {
            long[] elements = new long[10];
            for (int j = 0; j <= 9; j++) {
                elements[j] = (long)Math.pow(j, i);
            }
            powers.put(i, elements);
        }

        for (Long[] arrayNumber: uniqueNumbers) {
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
        }

        return result.toArray(new Long[0]);
    }

    private static ArrayList<Long[]> getUniqueNumbers(long number) {
        ArrayList<Long[]> result = new ArrayList<>();
        int numberLength = String.valueOf(number).length();
        Long[] cache = new Long[numberLength];

        for (int i = 0; i < numberLength; i++) {
            cache[i] = 9L;
        }

        do {
            // add current number to result
            result.add(cache.clone());

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

        return result;
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

    // 1 125
    public static long[] fastGetNumbers(long number) {
        long[] armstrongNumbers = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 153L, 370L, 371L, 407L, 1634L, 8208L, 9474L,
                54748L, 92727L, 93084L, 548834L, 1741725L, 4210818L, 9800817L, 9926315L, 24678050L, 24678051L,
                88593477L, 146511208L, 472335975L, 534494836L, 912985153L, 4679307774L, 32164049650L, 32164049651L,
                40028394225L, 42678290603L, 44708635679L, 49388550606L, 82693916578L, 94204591914L, 28116440335967L,
                4338281769391370L, 4338281769391371L, 21897142587612075L, 35641594208964132L, 35875699062250035L,
                1517841543307505039L, 3289582984443187032L, 4498128791164624869L, 4929273885928088826L };
        for (int i = armstrongNumbers.length - 1; i >=0 ; i--) {
            if (armstrongNumbers[i] < number) {
                return Arrays.copyOfRange(armstrongNumbers, 0, i + 1);
            }
        }

        return new long[] {};
    }
}
