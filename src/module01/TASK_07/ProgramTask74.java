package module01.TASK_07;

public class ProgramTask74 {
    public static void main(String[] args) {
        for (int i = 6; i > -1; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j < 14 - i * 2; j++) {
                System.out.print('*');
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
