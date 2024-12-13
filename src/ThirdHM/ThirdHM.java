package ThirdHM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThirdHM {
    public static class  NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

        public static class AgeComparator implements Comparator<Person> {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        }
            public static void main(String[] args) {

                List<Person> people = new ArrayList<>();
                people.add(new Person("Alice", 30));
                people.add(new Person("Bob", 25));
                people.add(new Person("Charlie", 35));
                people.add(new Person("David", 20));


                System.out.println("Список до сортировки по имени:");
                printList(people);

                Collections.sort(people, new NameComparator());
                System.out.println("Список после сортировки по имени:");
                printList(people);


                Collections.sort(people, new AgeComparator());
                System.out.println("Список после сортировки по возрасту:");
                printList(people);
            }


            private static void printList(List<Person> people) {
                for (Person person : people) {
                    System.out.println(person);
                }
                System.out.println();
            }
        }



