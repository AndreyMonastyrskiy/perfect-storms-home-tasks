package module02.TASK_03;

public class Programmer extends Employee implements Intellectual{
    public Programmer(String name, int age) {
        super(name, age);
    }

    public void programming() {
        System.out.println("Programming");
    }

    public void workInfo() {
        System.out.println("Programmer programming");
    }
}
