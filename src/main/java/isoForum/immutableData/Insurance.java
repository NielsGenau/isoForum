package isoForum.immutableData;

import java.math.BigDecimal;

/**
 * Created by gen on 19.06.2017.
 */
public final class Insurance {
    private final String name;
    private final BigDecimal price;


    public Insurance(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }


    private Insurance(Builder builder) {
        name = builder.name;
        price = builder.price;
    }


    public String getName() {
        return name;
    }


    public BigDecimal getPrice() {
        return price;
    }


    public static final class Builder {

        private String name;
        private BigDecimal price;


        public Builder() {
        }


        public Builder(Insurance copy) {
            this.name = copy.name;
            this.price = copy.price;
        }


        public Builder name(String val) {
            name = val;
            return this;
        }


        public Builder price(BigDecimal val) {
            price = val;
            return this;
        }


        public Insurance build() {
            return new Insurance(this);
        }
    }
}
