package module03.TASK_06;

public class Car implements Comparable<Car>{
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Car car) {
        return this.speed > car.speed ? 1 : -1;
    }

    @Override
    public String toString() {
        return "{" + this.model + ", " + this.speed + "}";
    }
}
