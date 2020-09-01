package module02.TASK_02;

public class Dog {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof  Dog) || !(((Dog) obj).name == this.name)) {
            return false;
        }
        return true;
    }
}
