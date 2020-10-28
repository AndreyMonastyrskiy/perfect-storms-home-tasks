package module03.TASK_05;

import java.util.HashSet;

public class ProgramTask05_01 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add("H" + i);
        }
        System.out.println(hashSet);
    }
}
