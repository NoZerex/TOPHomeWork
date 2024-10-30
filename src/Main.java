public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Bird("Яго",true);
        Animal animal2 = new Dog("Шарик");
        Animal animal3 = new Cat("Матроскин");

        Animal[] animals = {animal1, animal2,animal3};

        for (Animal animal : animals) {
            System.out.print(animal.getName() + ": ");
            animal.makeSound();
        }
    }
}
