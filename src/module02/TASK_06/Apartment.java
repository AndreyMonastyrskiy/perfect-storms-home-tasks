package module02.TASK_06;

import java.util.Random;

public class Apartment {
    private int floor = 1;
    private int numberOfRooms = 1;
    private int lifeTime = 1;

    public Apartment() {
    }

    public Apartment(int floor, int numberOfRooms, int lifeTime) {
        this.floor = floor;
        this.numberOfRooms = numberOfRooms > 0 ? numberOfRooms : 1; // minimum 1 room must exist
        this.lifeTime = lifeTime > 0 ? lifeTime : 1; // Lifetime must be minimum 1 day
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberOfRooms() {
        return this.numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms > 0 ? numberOfRooms : 1; // minimum 1 room must exist
    }

    public int getLifeTime() {
        return this.lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime > 0 ? lifeTime : 1; // Lifetime must be minimum 1 day
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floor=" + floor +
                ", numberOfRooms=" + numberOfRooms +
                ", lifeTime=" + lifeTime +
                '}';
    }

    public static Apartment[] generateApartments(int minFloor, int maxFloor, int minRoomCount, int maxRoomCount,
                                          int minLifeTime, int maxLifeTime, int apartmentCount) {
        Apartment[] result = new Apartment[apartmentCount];
        Random random = new Random();

        for (int i = 0; i < apartmentCount; i++) {
            result[i] = new Apartment(minFloor + random.nextInt(maxFloor - minFloor + 1),
                    minRoomCount + random.nextInt(maxRoomCount - minRoomCount + 1),
                    minLifeTime + random.nextInt(maxLifeTime - minLifeTime + 1));
        }

        return  result;
    }
}
