package isoForum.immutableData;


public final class Person {
    private final String firstName;
    private final String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    private Person(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public static final class Builder {

        private String firstName;
        private String lastName;


        public Builder() {
        }


        public Builder(Person copy) {
            this.firstName = copy.firstName;
            this.lastName = copy.lastName;
        }


        public Builder firstName(String val) {
            firstName = val;
            return this;
        }


        public Builder lastName(String val) {
            lastName = val;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }
}
