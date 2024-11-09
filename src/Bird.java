public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    void move() {
        if (canFly) {
            System.out.println("Птица летает");
        } else {
            System.out.println("Птица ходит");
        }

    }

    @Override
    void makeSound() {
        System.out.println("Чирик-чирик.");
    }


}
