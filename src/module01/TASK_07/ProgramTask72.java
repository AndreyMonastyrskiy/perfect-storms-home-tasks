package module01.TASK_07;

import java.util.Scanner;

public class ProgramTask72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data:");
        long n = scanner.nextLong();
        long counter = 0;
        while (counter <= n) {
            System.out.print(counter * counter + " ");
            counter++;
        }
    }
}
