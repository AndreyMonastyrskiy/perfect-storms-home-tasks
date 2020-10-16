package module03.TASK_02;

import java.util.ArrayList;
import java.util.List;

public class ProgramTask02_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(3);
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println(list);

        for (int i = list.size() - 1; i >= 0 ; i--) {
            list.remove(i);
        }
        System.out.println(list);

    }
}
