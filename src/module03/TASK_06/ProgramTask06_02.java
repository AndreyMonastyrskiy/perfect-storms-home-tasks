package module03.TASK_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramTask06_02 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 666));
        cars.add(new Car("Vaz", 10));
        cars.add(new Car("Chevrolet", 50));
        Collections.sort(cars);
        System.out.println(cars);
    }
}
