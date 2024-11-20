import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class House {
    private int numberOfFloors;
    private int numberOfRooms;
    private boolean hasGarage;

    public House(HouseBuilder builder) {
        this.numberOfFloors = builder.numberOfFloors;
        this.numberOfRooms = builder.numberOfRooms;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numberOfFloors == house.numberOfFloors && numberOfRooms == house.numberOfRooms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfFloors, numberOfRooms, hasGarage);
    }

    public static class HouseBuilder {
        private int numberOfFloors;
        private int numberOfRooms;
        private boolean hasGarage;


        public HouseBuilder setNumberOfFloors(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        public HouseBuilder setNumberOfRooms(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public static void main(String[] args) {
        House house1 = new House.HouseBuilder()
                .setNumberOfFloors(4)
                .setNumberOfRooms(2)
                .setHasGarage(true)
                .build();

        House house2 = new House.HouseBuilder()
                .setNumberOfFloors(3)
                .setNumberOfRooms(3)
                .setHasGarage(false)
                .build();
        House house3 = new House.HouseBuilder()
                .setNumberOfFloors(1)
                .setNumberOfRooms(3)
                .setHasGarage(false)
                .build();
        House house4 = new House.HouseBuilder()
                .setNumberOfFloors(2)
                .setNumberOfRooms(4)
                .setHasGarage(true)
                .build();

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);


        System.out.println("Дом 1: " + house1.numberOfFloors + " этаж, " + house1.numberOfRooms + " комнат, гараж: " + house1.hasGarage);
        System.out.println("Дом 2: " + house2.numberOfFloors + " этаж, " + house2.numberOfRooms + " комнат, гараж: " + house2.hasGarage);
        System.out.println("Наличие первного дома: " + houses.contains(house1) + "," + " Наличие второго дома: " + houses.contains(house2));
        System.out.println("Положение в списке третьего дома: " + houses.indexOf(house3) + "," + " Положение в списке третьего дома: " + houses.indexOf(house4));

    }

}





