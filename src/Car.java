import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public int compareTo(Car car) {
        int result = this.model.compareTo(car.model);
        if (result == 0) {
            result = Integer.compare(car.year, this.year);
        }
        if (result == 0) {
            result = this.color.compareTo(car.color);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Year: " + year + ", Color: " + color;
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Lada", 2024, "Black"));
        cars.add(new Car("Lada", 2024, "White"));
        cars.add(new Car("Lada", 2024, "Red"));
        cars.add(new Car("Lada", 2023, "Gray"));
        cars.add(new Car("Volga", 2024, "Black"));
        cars.add(new Car("Volga", 2023, "White"));
        cars.add(new Car("Volga", 2022, "Red"));
        cars.add(new Car("Audi", 2020, "Red"));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
