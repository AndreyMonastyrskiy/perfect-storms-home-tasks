package module03.TASK_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ProgramTask03_2 {
    public static void main(String[] args) {
        System.out.println("Fast Armstrong numbers search for long number (precomputed numbers):");
        long a = System.currentTimeMillis();
        System.out.println(Arrays.toString(fastGetNumber(Long.MAX_VALUE)));
        long b = System.currentTimeMillis();
        System.out.println("memory " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (8 * 128 * 1024));
        System.out.println("time = " + (b - a) / 1000);
        System.out.println("Slow Armstrong numbers search for long number:");
        a = System.currentTimeMillis();
        System.out.println(Arrays.toString(getNumbers(100_000_000L)));
        b = System.currentTimeMillis();
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

    public static long[] fastGetNumber(long number) {
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

    public static ArrayList<Long> getUniqueNumbers(long number) {
        ArrayList<Long> result = new ArrayList<>();

        return result;
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
