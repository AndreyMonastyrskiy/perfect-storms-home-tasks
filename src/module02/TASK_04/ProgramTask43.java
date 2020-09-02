package module02.TASK_04;

public class ProgramTask43 {
    public static void main(String[] args) {
        Leon leo = new Leon("Woolf");
        Leon.updateLeonName(leo, "King Leon");
        System.out.println(leo.getName());
    }
}
