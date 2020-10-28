package module03.TASK_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ProgramTask05_03 {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        String obj1 = new String("Object1");
        String obj2 = new String("Object2");
        String obj3 = new String("Object3");
        objects.add(obj1);
        objects.add(obj2);
        objects.add(obj2);
        objects.add(obj3);
        objects.add(obj3);
        objects.add(obj3);
        System.out.println(objects);
        System.out.println(getUniqueObjects(objects));
    }

    public static List<Object> getUniqueObjects(List<Object> inputList) {
        return new ArrayList<>(new HashSet<>(inputList));
    }
}
