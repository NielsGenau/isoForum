package isoForum.optional;

import java.util.Optional;

import isoForum.optional.api.Car;
import isoForum.optional.api.Insurance;
import isoForum.optional.api.Person;

/**
 * Created by gen on 16.06.2017.
 */
public class Chaining {

    public String getCarInsuranceName(Optional<Person> person) {
        return person
            .flatMap(Person::getCar)
            .flatMap(Car::getInsurance)
            .map(Insurance::getName)
            .orElse("Unknown");
    }
}
