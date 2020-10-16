package module03.TASK_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTask02_2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        while (list.size() < 10) {
            System.out.println("Enter new element for list (must be unique length):");
            String userInput = scanner.nextLine();
            if (userInput.length() == 0) {
                System.out.println("Element cannot be empty!");
                continue;
            }
            for (String element: list) {
                if (element.length() == userInput.length()) {
                    System.out.println("An element of this length is already in the list, try another");
                    continue;
                }
            }
            list.add(userInput);
        }

        String shortest = list.get(0);
        String longest = list.get(0);

        for (String element: list) {
            if (element.length() < shortest.length()) {
                shortest = element;
            }
            if (element.length() > longest.length()) {
                longest = element;
            }
        }

        for (String element: list) {
            if (element.equals(shortest)) {
                System.out.println(String.format("Shortest element '%s' appears first.", shortest));
                break;
            }
            if (element.equals(longest)) {
                System.out.println(String.format("longest element '%s' appears first.", longest));
                break;
            }
        }


    }
}
