package module02.TASK_04;

public class Cat {
    private String name;
    private static int instanceCount = 0;

    public Cat() {
        instanceCount++;
    }
    public Cat(String name) {
        this.name = name;
        instanceCount++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}
