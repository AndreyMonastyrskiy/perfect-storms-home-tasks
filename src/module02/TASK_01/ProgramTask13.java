package module02.TASK_01;

public class ProgramTask13 {
    public static void main(String[] args) {
        Person person = new Person("Sam", 33);
        Cat cat = new Cat("Basic", 99, Breed.NEBELUNG, person);
        System.out.println(cat.toString());
    }
}
