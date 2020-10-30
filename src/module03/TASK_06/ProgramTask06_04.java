package module03.TASK_06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProgramTask06_04 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Audi", 250));
        cars.add(new Car("BMW", 253));
        cars.add(new Car("Audi", 210));
        Comparator<Car> carModelComparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int result = car1.getModel().compareTo(car2.getModel());
                if (result == 0) {
                    result = car1.getSpeed() > car2.getSpeed() ? -1 : 1;
                }
                return result;
            }
        };
        Collections.sort(cars, carModelComparator);
        System.out.println(cars);
    }
}
