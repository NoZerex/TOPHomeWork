public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

     abstract void makeSound();
      abstract void move();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
