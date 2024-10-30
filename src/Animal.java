public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void makeSound(){
        System.out.println("MakeSound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
