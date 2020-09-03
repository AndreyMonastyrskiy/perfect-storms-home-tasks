package module02.TASK_07;

public class BigGarage {
    Vehicle[] vehicles = new Vehicle[2];

    public boolean enter(Vehicle vehicle) {
        if (this.vehicles[1] == null) {
            this.vehicles[1] = vehicle;
            return true;
        } else if (this.vehicles[0] == null) {
            this.vehicles[0] = vehicle;
            return true;
        }
        return false;
    }

    public boolean leave() {
        if (this.vehicles[1] != null) {
            this.vehicles[1] = null;
            return true;
        } else if (this.vehicles[0] != null) {
            this.vehicles[0] = null;
            return true;
        }
        return false;
    }

}
