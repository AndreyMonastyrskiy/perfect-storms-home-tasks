package module01.TASK_09;

import java.util.Scanner;

public class ProgramTask93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word consisting of an even number of letters:");
        String word1 = scanner.nextLine();
        System.out.println("Enter second word consisting of an even number of letters:");
        String word2 = scanner.nextLine();
        System.out.println(word1.substring(0, word1.length() / 2) + word2.substring(word2.length() / 2));
    }
}
