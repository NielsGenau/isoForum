package isoForum.functionalInterface.api;

public class Person {
    private int age;
    private int yearsWithoutAccident;
    private Insurance insurance;

    public Person(int age, int yearsWithoutAccident, Insurance insurance) {
        this.age = age;
        this.yearsWithoutAccident = yearsWithoutAccident;
        this.insurance = insurance;
    }
    
    public int getAge() {
        return age;
    }

    public int getYearsWithoutAccident() {
        return yearsWithoutAccident;
    }

    public Insurance getInsurance() {
        return insurance;
    }
    
}
