package module01.TASK_07;

import java.util.Scanner;

public class ProgramTask76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        char[] userInput = scanner.nextLine().toCharArray();
        for (int i = 0; i < userInput.length; i++) {
            for (int j = i + 1; j < userInput.length; j++) {
                if (userInput[i] == userInput[j]) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
