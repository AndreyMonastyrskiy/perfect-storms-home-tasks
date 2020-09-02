package module02.TASK_04;

public class ProgramTask42 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Schrodinger");
        Cat cat2 = new Cat("Bobik");
        System.out.println("Cat class instances count: " + Cat.getInstanceCount());
    }
}
