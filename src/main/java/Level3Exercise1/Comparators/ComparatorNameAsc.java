package Level3Exercise1.Comparators;

import Level3Exercise1.Person;

import java.util.Comparator;

public class ComparatorNameAsc implements Comparator<Person> {

    @Override
    public int compare(Person person, Person t1) {
        return person.getName().compareTo(t1.getName());
    }
}
