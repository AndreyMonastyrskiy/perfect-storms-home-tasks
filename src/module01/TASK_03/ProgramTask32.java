package module01.TASK_03;

public class ProgramTask32 {
    public static void main(String[] args) {
        //short type takes 16 bits of memory and can store values from -32768 to 32768
        short firstValue = -32768;
        int secondValue = 32768;
        short result = (short) (firstValue + secondValue);
        System.out.println("Result with short type: " + result);
    }
}
