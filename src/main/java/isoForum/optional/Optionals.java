package isoForum.optional;

import java.util.Optional;

import isoForum.optional.api.Car;
import isoForum.optional.api.Insurance;
import isoForum.optional.api.Person;

/**
 * Created by gen on 19.06.2017.
 */
public class Optionals {
    public void createOptionals(Car car) {
        Optional<Car> emptyCar = Optional.empty();
        Optional<Car> optionalCar = Optional.ofNullable(car);
    }

    public String getCarInsuranceName(Optional<Person> person, int maxAge) {
        return person.filter(person1 -> person1.getAge() > maxAge)
            .flatMap(Person::getCar)
            .flatMap(Car::getInsurance)
            .map(Insurance::getName)
            .orElse("Unknow");
    }
}
