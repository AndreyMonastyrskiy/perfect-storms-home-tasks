package module02.TASK_08;

import java.util.Arrays;

public class ProgramTask81 {
    public static void main(String[] args) {
        // Composition is a “belongs-to” type of relationship.
        // It means that one of the objects is a logically larger structure,
        // which contains the other object. In other words, it's part or member of the other object.
        // Aggregation is a “has-a” relationship. What distinguishes it from composition,
        // that it doesn't involve owning. As a result, the lifecycles of the objects aren't tied:
        // every one of them can exist independently of each other.
        // Relationships between classes Room and Building is a Composition.
        // Rooms cannot exist without a building.
        // Relationships between classes Building and People is a Aggregation,
        // because people can exist separately from buildings, just as buildings can exist without people.

        People man1 = new People("John", "Doe");
        People man2 = new People("Jane", "Doe");
        Building house1 = new Building(5);

        house1.setOwner(man1);
        System.out.println(house1);
        house1.setOwner(man2);
        System.out.println(house1);
        System.out.println(Arrays.toString(house1.getRooms()));
    }
}
