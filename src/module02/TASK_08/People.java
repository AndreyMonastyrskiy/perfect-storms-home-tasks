package module02.TASK_08;

public class People {
    private String surname;
    private String firstName;

    public People(String surname, String firstName) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "People{" +
                "surname='" + surname + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
