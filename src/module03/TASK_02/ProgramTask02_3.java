package module03.TASK_02;

import java.util.ArrayList;
import java.util.List;

public class ProgramTask02_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(5);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        EvenListItrerator iterator = new EvenListItrerator(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
