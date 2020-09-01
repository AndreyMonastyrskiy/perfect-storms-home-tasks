package module02.TASK_02;

public class ProgramTask21 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Basik", 99, Breed.BIRMAN);
        Cat cat2 = new Cat("GoGo", 1, Breed.NEBELUNG);
        Cat cat3 = new Cat("Forty", 19, Breed.SIAMESE);
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());
    }
}
