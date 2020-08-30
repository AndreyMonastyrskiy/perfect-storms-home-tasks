package module01.TASK_05;

public class ProgramTask54 {
    public static void main(String[] args) {
        int a = 10; // 11 after 7 line of code
        int c = a; // 10
        int b = ++a; // 11

        if (b >= a){ // true
            if (c == 10){ //true
                if ((c <= b) && (a != b)){ // true && false = false
                    System.out.println("All statements are true.");
                } else {
                    System.out.println("One of the statements isn't true."); // This line will be executed
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }

        // Corrected code fragment (Symbol "!" in line 26 replaced with "="):
        if (b >= a){ // true
            if (c == 10){ //true
                if ((c <= b) && (a == b)){ // true && true = true
                    System.out.println("All statements are true."); // This line will be executed
                } else {
                    System.out.println("One of the statements isn't true.");
                }
            } else {
                System.out.println("One of statements is true.");
            }
        } else {
            System.out.println("All statements are false");
        }

    }
}
