package module02.TASK_12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProgramTask12 {
    public static void main(String[] args) {
        // 1. Parameterized Class
        Record<Integer, String, String> record1 = new Record<>(0, "name1", "value1");
        Record<String, Short, Double> record2 = new Record<>("1", (short)47, 47.0d);
        Record<String, String, Boolean> record3 = new Record<>("2", "name3", false);
        record1.setId(-1);
        System.out.println(record1);
        record2.setName((short)33);
        System.out.println(record2);
        record3.setValue(true);
        System.out.println(record3);
        // 2. Parameterized Method
        List<String> list1 = new ArrayList<>(Arrays.asList("Value1", "Value2", "Value3"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 7, 9));
        fillListWithDefault(list1, "Hello");
        fillListWithDefault(list2, 47);
        System.out.println(list1);
        System.out.println(list2);
        // 3. Wildcards
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Jo"));
        animals.add(new Animal("Ho"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik"));
        cats.add(new Cat("Felix"));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Rex"));
        dogs.add(new Dog("Sharik"));
        // Unbounded Wildcard (Works with any List)
        printLastFromList(animals);
        printLastFromList(cats);
        printLastFromList(dogs);
        printLastFromList(Arrays.asList("1", "2", "3"));
        // Upper Bounded Wildcard (Can Work with Animal and his children's Cat and Dog)
        printRecordCount(animals);
        printRecordCount(cats);
        printRecordCount(dogs);
        // printRecordCount(Arrays.asList("1", "2", "3")); //Error! Can't work with this type of List
        // Lower Bounded Wildcard (Can work only with cat and his parent's Animal)
        printElementsCount(animals);
        printElementsCount(cats);
        //printElementsCount(dogs); //Error! Can't work with this type of List

    }

    // Parameterized Method
    private static <T> void fillListWithDefault(List<T> list, T defaultValue) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, defaultValue);
        }
    }

    //  Unbounded Wildcard
    private static void printLastFromList(List<?> list) {
        System.out.println("Last element from list: " + list.get(list.size() - 1));
    }

    // Upper Bounded Wildcard
    private static void printRecordCount(List<? extends Animal> list) {
        System.out.println("Records count: " + list.size());
    }
    
    // Lower Bounded Wildcard
    private static void printElementsCount(List<? super Cat> list) {
        System.out.println("List size: " + list.size());
    }
}
