package level3Exercise1.comparators;

import level3Exercise1.Person;

import java.util.Comparator;

public class ComparatorDNIAsc implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {
        return person.getDni().compareTo(t1.getDni());
    }
}
