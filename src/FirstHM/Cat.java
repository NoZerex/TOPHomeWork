package FirstHM;

public final class Cat extends Animal implements Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Кошка лазит по деревьям");
    }

    @Override
    void makeSound() {
        System.out.print("Мяу.");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет с игрушкой");
    }

    @Override
    public void beFriedly() {
        System.out.println("Кошка дружелюбна");
    }
}
