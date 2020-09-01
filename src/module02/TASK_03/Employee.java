package module02.TASK_03;

public abstract class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public  int getAge() {
        return this.age;
    }

    public void speak() {
        System.out.println(String.format("Hi, my name is \"%s\". I'm \"%d\" years old.", this.name, this.age));
    }

    public abstract void workInfo();
}
