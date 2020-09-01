package module02.TASK_01;

import java.util.Arrays;
import java.util.Comparator;

public class ProgramTask14 {
    public static void main(String[] args) {
        Person[] persons = {new Person("John", 13),
                            new Person("Liam", 22),
                            new Person("Benjamin", 198),
                            new Person("Andrew", 7),
                            new Person("Evelyn", 19),
                            new Person("Charlotte", 45)
        };

        sortByAge(persons);
        System.out.println("After sorting by age:");
        System.out.println(Arrays.toString(persons));

        sortByName(persons);
        System.out.println("After sorting by name:");
        System.out.println(Arrays.toString(persons));
    }


    public static void sortByAge(Person[] persons) {
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.age - person2.age;
            }
        });
    }

    public static void sortByName(Person[] persons) {
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.name.compareTo(person2.name);
            }
        });
    }
}
