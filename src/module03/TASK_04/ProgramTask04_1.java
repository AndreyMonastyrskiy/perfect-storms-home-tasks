package module03.TASK_04;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramTask04_1 {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();

        // fill the queue
        for (int i = 0; i < 20; i++) {
            queue.add(new Person());
        }
        // iterate over the queue
        int queueSize = queue.size();
        for (int i = 0; i < queueSize; i++) {
            Person person = queue.poll();
            if (person.number > 5) {
                queue.add(person);
            }
        }

        System.out.println(queue);


    }

}
