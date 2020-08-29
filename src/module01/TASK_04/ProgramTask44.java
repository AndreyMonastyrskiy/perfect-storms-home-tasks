package module01.TASK_04;

public class ProgramTask44 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        System.out.println(a < b); // true
        System.out.println(a > b); // false
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        a = 5;
        boolean result = a != b; // false, because the variables contain the same values
        System.out.println(result);
        //Сomparison operator's return boolean data type.

    }
}
