package module02.TASK_03;

public class Doctor extends Employee {
    public Doctor(String name, int age) {
        super(name, age);
    }

    public void heal() {
        System.out.println("Heals");
    }

    public void workInfo() {
        System.out.println("Doctor heals");
    }
}
