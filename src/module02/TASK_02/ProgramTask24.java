package module02.TASK_02;

public class ProgramTask24 {
    public static void main(String[] args) {
        Object a = new Integer(100);
        Object b = new Long(100);
        Object c = new String("100");
        a = null;
        a = c;
        c = b;
        b = a;

        // After line 7 (Objects created):
        // a -> 100
        // b -> 100L
        // c -> "100"
        // After line 11:
        // a -> "100"
        // b -> "100"
        // c -> 100L
        // -------------
        // Integer object 100 not used anymore. This object can be erased by garbage collector.
        // Answer: one object can be erased by garbage collector.


    }
}
