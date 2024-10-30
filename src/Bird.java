public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }


    @Override
    void makeSound() {
        System.out.println("Чирик-чирик.");
    }


}
