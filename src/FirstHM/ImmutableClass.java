package FirstHM;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass mutableObject;

    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass mutableObject) {
        this.name = name;
        this.numbers = Collections.unmodifiableList(numbers);
        this.mutableObject = new CustomMutableClass(mutableObject.getValue());
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public CustomMutableClass getMutableObject() {
        return new CustomMutableClass(mutableObject.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ImmutableClass)) return false;
        ImmutableClass that = (ImmutableClass) o;
        return name.equals(that.name) &&
                numbers.equals(that.numbers) &&
                mutableObject.getValue() == that.mutableObject.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, mutableObject.getValue());
    }
}