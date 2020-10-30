package module03.TASK_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProgramTask06_03 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 666));
        cars.add(new Car("Vaz", 10));
        cars.add(new Car("Chevrolet", 50));
        Comparator<Car> carModelComparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel()) * -1;
            }
        };
        Collections.sort(cars, carModelComparator);
        System.out.println(cars);
    }
}
