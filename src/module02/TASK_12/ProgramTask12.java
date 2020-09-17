package module02.TASK_12;

public class ProgramTask12 {
    public static void main(String[] args) {
        Record<Integer, String, String> record1 = new Record<>(0, "name1", "value1");
        Record<String, Short, Double> record2 = new Record<>("1", (short)47, 47.0d);
        Record<String, String, Boolean> record3 = new Record<>("2", "name3", false);
        System.out.println(record1);
        System.out.println(record2);
        System.out.println(record3);


    }
}
