package module02.TASK_07;

public abstract class Vehicle {
    private int size;
    private int power;

    public Vehicle(int size, int power) {
        this.size = size;
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }

    public int getSize() {
        return this.size;
    }

}
