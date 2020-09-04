package module02.TASK_08;

import java.util.Random;

public class Room {
    private int area;
    private int windowsCount;

    public Room(int area, int windowsCount) {
        this.area = area > 0 ? area : 1; // Area must be minimum 1
        this.windowsCount = windowsCount;
    }

    public int getArea() {
        return area;
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", windowsCount=" + windowsCount +
                '}';
    }

    public static Room[] generateRooms(int roomsCount) {
        Room[] result = new Room[roomsCount];
        Random rn = new Random();

        for (int i = 0; i < roomsCount; i++) {
            result[i] = new Room(1 + rn.nextInt(50),
                    rn.nextInt(5));
        }

        return result;
    }
}
