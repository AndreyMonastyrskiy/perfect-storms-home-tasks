package module02.TASK_04;

public class Leon {
    private String name;

    public Leon(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void updateLeonName(Leon leonInstance, String newName) {
        leonInstance.name = newName;
    }
}
