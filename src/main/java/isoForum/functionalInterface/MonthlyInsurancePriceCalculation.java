package isoForum.functionalInterface;

import isoForum.functionalInterface.api.Person;
import java.math.BigDecimal;

@FunctionalInterface
public interface MonthlyInsurancePriceCalculation {
    BigDecimal calculate(Person person);
}
