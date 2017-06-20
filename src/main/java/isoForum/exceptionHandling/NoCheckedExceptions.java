package isoForum.exceptionHandling;

import java.util.Optional;

import isoForum.exceptionHandling.api.Insurance;

import static isoForum.tryMonad.TryFactory.attempt;

/**
 * Created by gen on 19.06.2017.
 */
public class NoCheckedExceptions {

    public void handleException() {

        Optional<Insurance> parentInsurance = attempt(Insurance::new)
            .map(Insurance::getParentInsurance)
            .toOptional();
    }


    public void getId() {
        Insurance insurance = new Insurance();
        Integer id = insurance.getNumber().orElse(0);
    }


}
