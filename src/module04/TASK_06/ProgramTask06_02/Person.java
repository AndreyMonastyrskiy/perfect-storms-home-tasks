package module04.TASK_06.ProgramTask06_02;

public class Person implements Runnable {
    private final Mail mail;

    public Person(Mail mail) {
        this.mail = mail;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (mail) {
            mail.setText("Person [" + name + "] wrote an email 'AAA'");
            mail.notify();
        }
    }
}
