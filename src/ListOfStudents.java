import java.util.ArrayList;
import java.util.List;

public class ListOfStudents {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");

        List<String> additionalStudents = new ArrayList<>();
        additionalStudents.add("Frank");
        additionalStudents.add("Grace");
        students.addAll(additionalStudents);

        students.remove("Bob");
        students.remove(3);
        System.out.println("Содержит список 'Alice': " + students.contains("Alice"));

        List<String> checkStudents = new ArrayList<>();
        checkStudents.add("Charlie");
        checkStudents.add("David");
        System.out.println("Содержит список 'Charlie' и 'David': " + students.containsAll(checkStudents));

        System.out.println("Число студентов: " + students.size());
        System.out.println("Является ли список пустым: " + students.isEmpty());

        students.clear();
        System.out.println("Является ли список пустым после очистки: " + students.isEmpty());
    }
}