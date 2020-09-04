package module02.TASK_06;

import java.util.Arrays;
import java.util.Random;

public class House {
    private long id;
    private Apartment[] apartments;
    private BuildingType buildingType;
    private int floorCount;

    public House(long id, Apartment[] apartments, BuildingType buildingType, int floorCount) {
        this.id = id;
        this.apartments = apartments;
        this.buildingType = buildingType;
        this.floorCount = floorCount;
    }

    public House(long id, int apartmentsCountToGenerate, BuildingType buildingType, int floorCount,
                 int roomsCount, int apartmentsCount, int lifeTime, Street street) {
        this.id = id;
        this.apartments = Apartment.generateApartments(1, floorCount, roomsCount, roomsCount,
                lifeTime, lifeTime, apartmentsCount, street);
        this.buildingType = buildingType;
        this.floorCount = floorCount;
    }

    public House(int id) {
        Random random = new Random();

        this.id = id;
        this.apartments = new Apartment[] {new Apartment()};
        this.buildingType = BuildingType.values()[random.nextInt(BuildingType.values().length)];
        this.floorCount = 1;
    }


    public long getId() {
        return this.id;
    }

    public int getApartmentsNumber() {
        return this.apartments.length;
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
                ", buildingType=" + buildingType.name() +
                ", floorCount=" + floorCount +
                '}' + System.lineSeparator();
    }

    public static House[] generateHouses(int houseCount) {
        House[] result = new House[houseCount];
        Random rn = new Random();

        for (int i = 0; i < houseCount; i++) {
            result[i] = new House(i, 1 + rn.nextInt(100),
                    BuildingType.values()[rn.nextInt(BuildingType.values().length)],
                    1 + rn.nextInt(100),
                    1 + rn.nextInt(10),
                    1 + rn.nextInt(100),
                    1 + rn.nextInt(365),
                    Street.values()[rn.nextInt(Street.values().length)]);
        }

        return result;
    }

    public static Apartment[] getApartmentsWithRoomsCount(House[] houses, int roomsCount) {
        Apartment[] result = new Apartment[0];
        for (House house: houses) {
            for (Apartment apartment: house.apartments) {
                if (apartment.getNumberOfRooms() == roomsCount) {
                    addToApartments(result, apartment);
                }
            }
        }
        return result;
    }



    private static Apartment[] addToApartments(Apartment[] apartments, Apartment newAppartment) {
        Apartment[] result = new Apartment[apartments.length + 1];
        for (int i = 0; i < apartments.length; i++) {
            result[i] = apartments[i];
        }
        result[result.length - 1] = newAppartment;
        return result;
    }

}
