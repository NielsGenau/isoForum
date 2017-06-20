package isoForum.exceptionHandling.api;

import java.util.List;
import java.util.Optional;

/**
 * Created by gen on 19.06.2017.
 */
public class Insurance {
    private Integer number;


    public Optional<Integer> getNumber() {
        return Optional.ofNullable(number);
    }


    public Insurance getParentInsurance() throws Exception {
        throw new Exception();
    }

    public List<Insurance> getAllInsurances() throws RuntimeException {
        throw new RuntimeException();
    }
}
