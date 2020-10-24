package module03.TASK_04;

import java.util.Random;

public class Person {
    int number;

    public Person() {
        this.number = new Random().nextInt(11);
    }

    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                '}';
    }
}
