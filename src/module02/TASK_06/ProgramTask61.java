package module02.TASK_06;

import java.util.Arrays;

public class ProgramTask61 {
    public static void main(String[] args) {
        System.out.println("Generating 10 houses...");
        House[] houses = House.generateHouses(10);
        System.out.println("Search for apartments with 2 rooms:");
        System.out.println(Arrays.toString(House.getApartmentsWithRoomsCount(houses,2)));
        System.out.println("Search for apartments with 2 rooms and located on floor from 1 to 3:");
        System.out.println(Arrays.toString(House.getApartmentsWithRoomsCountAndFloor(houses, 2, 1, 3)));
        System.out.println("Search for apartments with an area exceeding 99:");
        System.out.println(Arrays.toString(House.getApartmentsWithMinArea(houses,99)));
    }

}
