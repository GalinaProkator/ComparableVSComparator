import java.util.*;

public class TesterPerson {
    public static void main(String[] args) {
        List <Person> people = new ArrayList<>();

        Person person1 = new Person(1l, "Vasya", 74);
        Person person2 = new Person(3l, "Olya", 50);
        Person person3 = new Person(4l, "Katya", 78);
        Person person4 = new Person(5l, "Dasha", 52);
        Person person5 = new Person(2l, "Petya", 91);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);

        Collections.sort(people);
        System.out.println(people);

        Collections.sort(people, new WeightSort());
        System.out.println(people);

        Person person6 = new Person(2l, "Petya", 96);

        Set <Person> peopleSet = new HashSet<>();
        peopleSet.add(person1);
        peopleSet.add(person2);
        peopleSet.add(person3);
        peopleSet.add(person4);
        peopleSet.add(person5);
        peopleSet.add(person6);

        System.out.println(peopleSet.size());

    }
}
