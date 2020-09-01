package module02.TASK_03;

public class ProgramTask33 {
    public static void main(String[] args) {
        Builder builder1 = new Builder("Jhon", 32);
        Builder builder2 = new Builder("Mark", 31);
        Builder builder3 = new Builder("Sam", 28);
        Doctor doctor1 = new Doctor("William", 19);
        Doctor doctor2 = new Doctor("Alex", 43);
        Doctor doctor3 = new Doctor("Jo", 33);
        Programmer programmer1 = new Programmer("Stive", 88);
        Programmer programmer2 = new Programmer("Din", 45);
        Programmer programmer3 = new Programmer("Andrew", 23);
        builder1.build();
        builder2.workInfo();
        builder3.drag();
        doctor1.heal();
        doctor2.workInfo();
        doctor3.think();
        programmer1.programming();
        programmer2.workInfo();
        programmer3.think();
    }
}
