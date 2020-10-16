package module03.TASK_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProgramTask02_1 {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("Element" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for adding elements to the end of ArrayList: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("Element" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for adding elements to the end of LinkedList: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int index = arrayList.indexOf("Element" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for searching elements in ArrayList: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            int index = linkedList.indexOf("Element" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for searching elements in LinkedList: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove("Element" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for removing elements from ArrayList: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove("Element" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for removing elements from LinkedList: " + (endTime - startTime) + " ms");

        System.out.println("ArrayList work faster in search operations, " +
                "and when it is necessary to refer to elements by an index.");
        System.out.println("LinkedList work faster when it is necessary to frequently remove or add new elements.");
    }
}
