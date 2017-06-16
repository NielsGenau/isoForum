package isoForum.optional.api;


import java.util.Optional;

public final class Car {
    private final Optional<Insurance> insurance;


    public Car(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }


    private Car(Builder builder) {
        insurance = builder.insurance;
    }


    public Optional<Insurance> getInsurance() {
        return insurance;
    }


    public static final class Builder {

        private Optional<Insurance> insurance;


        public Builder() {
        }


        public Builder insurance(Optional<Insurance> val) {
            insurance = val;
            return this;
        }


        public Car build() {
            return new Car(this);
        }
    }
}
