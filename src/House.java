public class House {
    private int numberOfFloors;
    private int numberOfRooms;
    private boolean hasGarage;

    public House(HouseBuilder builder) {
        this.numberOfFloors = builder.numberOfFloors;
        this.numberOfRooms = builder.numberOfRooms;
        this.hasGarage = builder.hasGarage;
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

        System.out.println("Дом 1: " + house1.numberOfFloors + " этаж, " + house1.numberOfRooms + " комнат, гараж: " + house1.hasGarage);
        System.out.println("Дом 2: " + house2.numberOfFloors + " этаж, " + house2.numberOfRooms + " комнат, гараж: " + house2.hasGarage);
    }
}





