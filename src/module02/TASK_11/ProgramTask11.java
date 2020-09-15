package module02.TASK_11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ProgramTask11 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Elder");
        person.setCompany("Organization");
        Class personClass = Person.class;
        try {
            Field ageField = personClass.getDeclaredField("age");
            Field nameField = personClass.getDeclaredField("name");
            ageField.setAccessible(true);
            ageField.set(person, 111);
            ageField.setAccessible(false);
            System.out.println(person.getAge());
            nameField.setAccessible(true);
            System.out.println(nameField.get(person));
            nameField.setAccessible(false);
            Method getCompanyMethod = personClass.getDeclaredMethod("getCompany");
            getCompanyMethod.setAccessible(true);
            System.out.println(getCompanyMethod.invoke(person));
            getCompanyMethod.setAccessible(false);
            System.out.println("-------------------------------------------------");
            for (Field field: personClass.getDeclaredFields()) {
                System.out.println(field);
            }
            System.out.println("-------------------------------------------------");
            for (Method method: personClass.getMethods()) {
                System.out.println(method);
            }
            System.out.println("-------------------------------------------------");
            for (Method method: personClass.getDeclaredMethods()) {
                System.out.println(method);
            }
            System.out.println("-------------------------------------------------");
            Object person1 = personClass.getConstructor().newInstance();
            System.out.println(person1);
            System.out.println("-------------------------------------------------");
            Object person2 = personClass.getConstructor(int.class, String.class, String.class)
                    .newInstance( 0, "NoName", "NoCompany");
            System.out.println(person2);


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
