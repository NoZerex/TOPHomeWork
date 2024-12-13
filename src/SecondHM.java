import java.util.ArrayList;
import java.util.List;

public class SecondHM {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla"));
        cars.add(new Car("Honda", "Civic"));
        cars.add(new Car("BMW", "X5"));

        try {
            Car car = getCar(cars, "Ford", "Focus");
            System.out.println("Найдена машина: " + car);
        } catch (CarNotFountException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Car getCar(List<Car> cars, String brand, String model) {
        for (Car car : cars) {
            if (car.brand.equals(brand) && car.model.equals(model)) {
                return car;
            }
        }
        throw new CarNotFountException("Машина с параметрами " + brand + " " + model + "  в списке не найдена");
    }

    public static class Car {
        private String brand;
        private String model;

        public Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        @Override
        public String toString() {
            return "брэнд: " + brand  + ", модель: " + model ;
        }

    }

    public static class CarNotFountException extends RuntimeException {
        public CarNotFountException(String message) {
            super(message);
        }
    }


}



