package module02.TASK_07;

public abstract class Bus extends Vehicle{
    private int numberSeats;

    public Bus(int size, int power, int numberSeats) {
        super(size, power);
        this.numberSeats = numberSeats;
    }

    public int getNumberSeats() {
        return this.numberSeats;
    }
}

