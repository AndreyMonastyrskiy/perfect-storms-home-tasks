package module01.TASK_04;

public class ProgramTask46 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        // Bitwise operators are applied to each individual bit of each operand.
        // NOT operator (~) inverts all bits of the operand.
        // &   |   ~   ^
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(~b);
    }
}
