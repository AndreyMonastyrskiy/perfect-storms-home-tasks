package module02.TASK_01;

import java.util.Date;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void meditaion() {
        System.out.println(String.format("I think - it means I exist. (%s) %s", this.name, new Date().toString()));
    }
}
