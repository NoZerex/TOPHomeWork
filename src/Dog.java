public class Dog  extends Animal implements Pet{
    @Override
    public void beFriedly() {
        System.out.println("Собака дружелюбна");

    }

    @Override
    public void play() {
        System.out.println("Собака играет с игрушкой");

    }

    public Dog(String name){
        super(name);
    }

    @Override
    void move() {
        System.out.println("Собака бегает по дому");

    }

    @Override
    void makeSound() {
        System.out.print("Гав-гав.");
    }
}
