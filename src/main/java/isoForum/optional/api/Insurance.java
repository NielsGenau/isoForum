package isoForum.optional.api;

public final class Insurance {
    private final String name;


    public Insurance(String name) {
        this.name = name;
    }


    private Insurance(Builder builder) {
        name = builder.name;
    }


    public String getName() {
        return name;
    }


    public static final class Builder {

        private String name;


        public Builder() {
        }


        public Builder name(String val) {
            name = val;
            return this;
        }


        public Insurance build() {
            return new Insurance(this);
        }
    }
}
