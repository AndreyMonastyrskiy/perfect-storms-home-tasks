package module02.TASK_12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProgramTask12 {
    public static void main(String[] args) {
        Record<Integer, String, String> record1 = new Record<>(0, "name1", "value1");
        Record<String, Short, Double> record2 = new Record<>("1", (short)47, 47.0d);
        Record<String, String, Boolean> record3 = new Record<>("2", "name3", false);
        record1.setId(-1);
        System.out.println(record1);
        record2.setName((short)33);
        System.out.println(record2);
        record3.setValue(true);
        System.out.println(record3);

        List<String> list1 = new ArrayList<>(Arrays.asList("Value1", "Value2", "Value3"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 7, 9));
        fillListWithDefault(list1, "Hello");
        fillListWithDefault(list2, 47);
        System.out.println(list1);
        System.out.println(list2);

    }

    private static <T> void fillListWithDefault(List<T> list, T defaultValue) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, defaultValue);
        }
    }
}
