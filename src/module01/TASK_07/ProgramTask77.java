package module01.TASK_07;

public class ProgramTask77 {
    public static void main(String[] args) {
        int peopleCount = 10000000;
        int birtCount = (peopleCount / 1000) * 14;
        int deathCount = (peopleCount / 1000) * 8;

        for (int i = 0; i < 10; i++) {
            peopleCount += birtCount - deathCount;
            birtCount = (peopleCount / 1000) * 14;
            deathCount = (peopleCount / 1000) * 8;
        }

        System.out.println(peopleCount);
    }
}
