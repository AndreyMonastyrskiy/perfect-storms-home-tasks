package module03.TASK_04;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProgramTask04_2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t1 > t2 ? 1: -1;
            }
        });

        queue.add(1);
        queue.add(7);
        queue.add(5);
        queue.add(9);
        queue.add(4);

        System.out.println(queue);
    }
}
