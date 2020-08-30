package module01.TASK_07;

import java.util.Scanner;

public class ProgramTask72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any natural number:");
        long n = scanner.nextLong();
        long counter = 0;
        while (counter <= n) {
            System.out.println(counter * counter);
            counter++;
        }
    }
}
