package module02.TASK_07;

public class Garage {
    private Vehicle vehicle;

    public boolean enter(Vehicle vehicle) {
        if (this.vehicle == null && (vehicle instanceof Car || vehicle instanceof Truck)) {
            this.vehicle = vehicle;
            return true;
        }
        return false;
    }

    public boolean leave() {
        if (this.vehicle != null) {
            this.vehicle = null;
            return true;
        }
        return false;
    }
}
