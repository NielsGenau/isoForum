package isoForum.optional.api;

import java.util.Optional;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final Optional<String> title;
    private final Optional<Car> car;
    private final int age;


    public Person(String firstName, String lastName, Optional<String> title, Optional<Car> car, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.car = car;
        this.age = age;
    }


    private Person(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        title = builder.title;
        car = builder.car;
        age = builder.age;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public Optional<String> getTitle() {
        return title;
    }


    public Optional<Car> getCar() {
        return car;
    }


    public int getAge() {
        return age;
    }


    public static final class Builder {

        private String firstName;
        private String lastName;
        private Optional<String> title;
        private Optional<Car> car;
        private int age;


        public Builder() {
        }


        public Builder firstName(String val) {
            firstName = val;
            return this;
        }


        public Builder lastName(String val) {
            lastName = val;
            return this;
        }


        public Builder title(Optional<String> val) {
            title = val;
            return this;
        }


        public Builder car(Optional<Car> val) {
            car = val;
            return this;
        }


        public Builder age(int val) {
            age = val;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }
}
