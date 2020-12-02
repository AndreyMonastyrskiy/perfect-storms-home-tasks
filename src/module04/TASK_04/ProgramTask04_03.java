package module04.TASK_04;

import java.util.Arrays;
import java.util.Collection;

public class ProgramTask04_03 {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");
        collection.stream().
                flatMapToInt(p -> Arrays.asList(p.split(",")).
                        stream().
                        mapToInt(Integer::parseInt)).
                forEach(s -> System.out.print(s + " "));
    }
}
