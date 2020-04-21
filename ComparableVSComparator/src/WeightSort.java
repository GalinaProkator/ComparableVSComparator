import java.util.Comparator;

public class WeightSort implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getWeight() - p2.getWeight();
    }
}
