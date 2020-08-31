package module01.TASK_09;

public class ProgramTask91 {
    public static void main(String[] args) {
        String st = "Java"; // Pull + 1
        String st2 = new String("Java"); // New object with a unique address
        String st3 = st2.intern(); // Already in pull
        String st4 = "java"; // Pull + 1
        // String st = null; - Error, st already announced (line 5 of code)
        String st6 = new String("JAVA"); // New object with a unique address
        // As a result, the pool will contain two string literal's
    }
}
