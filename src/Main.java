public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird("Яго", true);
        Animal dog = new Dog("Шарик");
        Animal cat = new Cat("Матроскин");

        Animal[] animals = {bird, dog, cat};

        for (Animal animal : animals) {
            System.out.print(animal.getName() + ": ");
            animal.makeSound();
            if (animal instanceof Dog) {
                System.out.print(" ");
                ((Dog) animal).play();
            } else if (animal instanceof Cat) {
                System.out.print(" ");
                ((Cat) animal).play();
            }
            System.out.println();
        }

    }
}