package module02.TASK_02;

public class ProgramTask23 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Pit");
        Dog dog2 = new Dog("Bull");
        Dog dog3 = new Dog("Bull");
        String dog4 = new String("Bull");

        System.out.println(dog1.equals(dog2));
        System.out.println(dog2.equals(dog3));
        System.out.println(dog3.equals(dog4));
    }
}
