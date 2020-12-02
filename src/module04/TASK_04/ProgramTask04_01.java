package module04.TASK_04;

import java.util.Arrays;
import java.util.Collection;

public class ProgramTask04_01 {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("a1", "a2", "a3", "a1");
        collection.stream().skip(1).limit(2).forEachOrdered(p -> System.out.print(p + " "));
        System.out.println(System.lineSeparator() + collection.stream().skip(collection.size() - 1).findFirst().get());
    }
}
