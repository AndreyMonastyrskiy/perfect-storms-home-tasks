package module02.TASK_11;

public class Person {
    private String name;
    private int age;
    private String company;

    public Person() {}

    public Person(int age, String name, String company) {
        this.age = age;
        this.name = name;
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    private String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                '}';
    }
}
