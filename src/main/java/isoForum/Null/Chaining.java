package isoForum.Null;

import isoForum.Null.api.Person;


public class Chaining {
    public String getCarInsuranceName(Person person) {
        return person.getCar().getInsurance().getName();
    }
}
