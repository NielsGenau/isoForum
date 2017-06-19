package isoForum.functionalInterface;

import isoForum.functionalInterface.api.Insurance;
import isoForum.functionalInterface.api.Person;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Functions {
    private static final List<Person> personsUnderContract = Arrays.asList(
            new Person(42, 20, new Insurance("Billighaftpflicht", BigDecimal.valueOf(1995, 2))),
            new Person(20, 2, new Insurance("Vollkasko", BigDecimal.valueOf(100))),
            new Person(25, 5, new Insurance("Teilkasko", BigDecimal.valueOf(80)))
    );
    
    public void initial(){
        MonthlyInsurancePriceCalculation insurancePriceCalculation = new MonthlyInsurancePriceCalculation() {
            @Override
            public BigDecimal calculate(Person person) {
                return BigDecimal.valueOf((100 - person.getAge()) * 10 - person.getYearsWithoutAccident());
            }
        };
    }
    
    public void lambdaRefactoring(){
        MonthlyInsurancePriceCalculation insurancePriceCalculation = p -> BigDecimal.valueOf((100 - p.getAge()) * 10 - p.getYearsWithoutAccident());
    }
    
    public void streams(){
        Optional<BigDecimal> youngPeopleCost = personsUnderContract.stream()
                .filter(p -> p.getAge() < 30)
                .filter(p -> p.getYearsWithoutAccident() > 0)
                .map(p -> p.getInsurance())
                .map(i -> i.getMonthlyCost())
                .reduce((p1, p2) -> p1.add(p2));
                //.reduce(Functions::sum);
        
        // REDUCE AN WHITEBOARD ERKLÄREN
    }
    
    private static BigDecimal sum(BigDecimal b1, BigDecimal b2){
        return b1.add(b2);
    }
}
