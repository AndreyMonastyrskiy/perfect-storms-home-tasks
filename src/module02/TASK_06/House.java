package module02.TASK_06;

import java.util.Arrays;
import java.util.Random;

public class House {
    private long id;
    private Apartment[] apartments;
    private Street street;
    private BuildingType buildingType;
    private int floorCount;

    public House(long id, Apartment[] apartments, Street street, BuildingType buildingType, int floorCount) {
        this.id = id;
        this.apartments = apartments;
        this.street = street;
        this.buildingType = buildingType;
        this.floorCount = floorCount;
    }

    public House(long id, int apartmentsCountToGenerate, Street street, BuildingType buildingType, int floorCount,
                 int roomsCount, int apartmentsCount, int lifeTime) {
        this.id = id;
        this.apartments = Apartment.generateApartments(1, floorCount, roomsCount, roomsCount,
                lifeTime, lifeTime, apartmentsCount);
        this.street = street;
        this.buildingType = buildingType;
        this.floorCount = floorCount;
    }

    public House(int id) {
        Random random = new Random();

        this.id = id;
        this.apartments = new Apartment[] {new Apartment()};
        this.street = Street.values()[random.nextInt(Street.values().length)];
        this.buildingType = BuildingType.values()[random.nextInt(BuildingType.values().length)];
        this.floorCount = 1;
    }


    public long getId() {
        return this.id;
    }

    public int getApartmentsNumber() {
        return this.apartments.length;
    }

    public Street getStreet() {
        return this.street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public BuildingType getBuildingType() {
        return this.buildingType;
    }

    public int getFloorCount() {
        return this.floorCount;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", apartments=" + Arrays.toString(apartments) +
                ", street=" + street.name() +
                ", buildingType=" + buildingType.name() +
                ", floorCount=" + floorCount +
                '}';
    }

    public static House[] generateHouses(int houseCount) {
        House[] result = new House[houseCount];
        Random rn = new Random();

        for (int i = 0; i < houseCount; i++) {
            result[i] = new House(i, 1 + rn.nextInt(100),
                    Street.values()[rn.nextInt(Street.values().length)],
                    BuildingType.values()[rn.nextInt(BuildingType.values().length)],
                    1 + rn.nextInt(100), 1 + rn.nextInt(10),
                    1 + rn.nextInt(100), 1 + rn.nextInt(365));
        }

        return result;
    }

}