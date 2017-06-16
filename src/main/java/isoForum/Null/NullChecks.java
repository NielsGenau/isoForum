package isoForum.Null;

import isoForum.Null.api.Car;
import isoForum.Null.api.Insurance;
import isoForum.Null.api.Person;


public class NullChecks {
    public String getCarInsuranceName(Person person) {
        if (person != null) {
            Car car = person.getCar();
            if (car != null) {
                Insurance insurance = car.getInsurance();
                if (insurance != null) {
                    return insurance.getName();
                }
            }
        }
        return "Unknown";
    }
}
