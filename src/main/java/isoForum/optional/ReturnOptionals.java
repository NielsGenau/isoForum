package isoForum.optional;

import java.util.Optional;

import isoForum.optional.api.Insurance;

public class ReturnOptionals {
    private Insurance insurance;

    public Optional<Insurance> getOptionalInsurance() {
        return Optional.ofNullable(insurance);
    }

    public Insurance getInsurance() {
        return Optional.ofNullable(insurance).orElse(new Insurance("Unknown"));
    }


}
