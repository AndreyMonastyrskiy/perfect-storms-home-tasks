package module03.TASK_05;

import java.util.TreeSet;
import java.util.Scanner;

public class ProgramTask05_02 {
    public static void main(String[] args) {
        TreeSet<Character> chars = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            Character currentChar = Character.toLowerCase(userInput.charAt(i));
            if (currentChar.toString().matches("[a-z]")) {
                chars.add(currentChar);
            }
        }

        String result = "";

        for (int i = 0; i < 5; i++) {
            if (chars.isEmpty()) { break; }
            result += chars.pollFirst();
        }

        System.out.println(result);
    }
}
