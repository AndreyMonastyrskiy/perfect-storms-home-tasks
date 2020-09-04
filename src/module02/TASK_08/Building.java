package module02.TASK_08;

import java.util.Arrays;

public class Building {
    private Room[] rooms;
    private People owner;

    public Building(int roomsCount) {
        this.rooms = Room.generateRooms(roomsCount);
    }

    public Room[] getRooms() {
        return this.rooms;
    }

    public People getOwner() {
        return this.owner;
    }

    public void setOwner(People owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Building{" +
                "rooms=" + Arrays.toString(rooms) +
                ", owner=" + owner +
                '}';
    }
}
