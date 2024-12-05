package SecondHM;

public class Box<T> {
    private T content;

    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }

    public boolean isEmpty() {
        return content == null;
    }

    public void clear() {
        content = null;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println(stringBox.get());

        Box<Boolean> booleanBox = new Box<>();
        System.out.println(booleanBox.isEmpty());
        booleanBox.set(true);
        System.out.println(booleanBox.isEmpty());
        booleanBox.clear();
        System.out.println(booleanBox.isEmpty());
    }
}