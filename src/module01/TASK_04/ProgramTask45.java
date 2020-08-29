package module01.TASK_04;

public class ProgramTask45 {
    public static void main(String[] args) {
        boolean bOne = true;
        boolean bTwo = false;

        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(!bOne);
        System.out.println(!bTwo);
        System.out.println(bOne ^ bTwo);
        System.out.println(bOne & bTwo);
        System.out.println(bOne | bTwo);

        bTwo = true;

        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(!bOne);
        System.out.println(!bTwo);
        System.out.println(bOne ^ bTwo);
        System.out.println(bOne & bTwo);
        System.out.println(bOne | bTwo);

        // Logical operators return boolean values.
        // The logical operator NOT (!), unlike the others, is unary.
        // Shorthand operators differ from regular operators in that they may not check the second operand
        // if this does not affect the result.

        // true || false return true
        // false && true return false
        // !true || 1 >= 0 return true
        // false && 5  Error. Operator && cannot compare boolean and int
        // true &&! false return true
        // true ^! true return true
        // 1> = 1 || false Error. Extra space in operator >=
        // true && 5 - 5 Error. Operator && cannot compare boolean and int


    }
}
