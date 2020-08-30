package module01.TASK_05;

import java.util.Scanner;

public class ProgramTask56 {
    public static void main(String[] args) {
        System.out.println("Enter any number of month:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Wrong number of month!");
                break;
        }
    }
}
