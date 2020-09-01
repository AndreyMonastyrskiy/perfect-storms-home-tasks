package module02.TASK_02;

public class Human {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 666;
    }
}
