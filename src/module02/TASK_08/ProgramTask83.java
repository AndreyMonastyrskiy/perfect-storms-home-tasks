package module02.TASK_08;

public class ProgramTask83 {
    public static void main(String[] args) {
        String password1 = "qwert";
        String password2 = "7a#Q,er";
        String password3 = "7asQaer";

        String regExp = "^(?=.*\\p{Digit})(?=.*\\p{L})(?=.*\\p{Punct}).{6,}$";

        System.out.println(password1.matches(regExp));
        System.out.println(password2.matches(regExp));
        System.out.println(password3.matches(regExp));
    }
}
