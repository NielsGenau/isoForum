package isoForum.functionalInterface.api;

import java.math.BigDecimal;

public class Insurance {
    private String name;
    private BigDecimal monthlyCost;

    public Insurance(String name, BigDecimal monthlyCost) {
        this.name = name;
        this.monthlyCost = monthlyCost;
    }

    public BigDecimal getMonthlyCost() {
        return monthlyCost;
    }

    public String getName() {
        return name;
    }
}
