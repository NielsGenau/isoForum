package isoForum.optional;

import java.util.Optional;

import isoForum.optional.api.Insurance;

/**
 * Created by gen on 16.06.2017.
 */
public class CreatingOfOptionals {

    public static void createOptionals(Insurance insurance) {
        Optional<Insurance> emptyInsurance = Optional.empty();
        Optional<Insurance> optionalInsurance = Optional.of(insurance); // NullPointerExceptions!!
        Optional<Insurance> nullableInsurance = Optional.ofNullable(insurance);
    }
}
