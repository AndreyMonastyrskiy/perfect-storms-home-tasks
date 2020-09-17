package module02.TASK_12;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Animal run.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
