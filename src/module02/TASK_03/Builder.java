package module02.TASK_03;

public class Builder extends Employee implements  Strongman{
    public Builder(String name, int age) {
        super(name, age);
    }

    public void build() {
        System.out.println("Builds");
    }

    public void workInfo() {
        System.out.println("Builder builds");
    }
}
