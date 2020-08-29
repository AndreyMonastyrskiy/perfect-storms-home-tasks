package module01.TASK_03;

public class ProgramTask31 {
    public static void main(String[] args) {
        //byte type takes 8 bits of memory and can store values from -128 to 127
        byte firstValue = 127;
        short secondValue = 255;
        byte result = (byte) (firstValue - secondValue);
        System.out.println("Result with byte type: " + result);
    }
}
