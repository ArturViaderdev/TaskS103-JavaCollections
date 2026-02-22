package Level3Exercise1.Comparators;

import Level3Exercise1.Person;

import java.util.Comparator;

public class ComparatorDNIAsc implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {
        return person.getDni().compareTo(t1.getDni());
    }
}
