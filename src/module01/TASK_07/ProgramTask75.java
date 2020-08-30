package module01.TASK_07;

import java.util.Scanner;

public class ProgramTask75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        System.out.println("Enter the next integer. Zero is for exit:");
        long userInput = scanner.nextLong();
        while (userInput != 0) {
            sum += userInput;
            System.out.println("Enter the next integer. Zero is for exit:");
            userInput = scanner.nextLong();
        }
        System.out.println("Sum of entered numbers: " + sum);
    }
}
