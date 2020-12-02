package module04.TASK_04;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class ProgramTask04_02 {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("a1", "a4", "a3", "a2", "a1", "a4");
        collection.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        collection.stream().sorted(Comparator.reverseOrder()).distinct().forEach(s -> System.out.print(s + " "));

    }
}
