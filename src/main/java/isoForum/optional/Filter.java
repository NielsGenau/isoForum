package isoForum.optional;

import java.util.Optional;

import isoForum.optional.api.Person;

public final class Filter {
    private static final int minAge = 18;
    public Optional<Person> getAdultPerson(Optional<Person> person) {
        return person.filter(person1 -> person1.getAge() > minAge);
    }
}
