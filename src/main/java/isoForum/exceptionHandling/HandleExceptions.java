package isoForum.exceptionHandling;

import isoForum.exceptionHandling.api.Insurance;

/**
 * Created by gen on 19.06.2017.
 */
public class HandleExceptions {
    public void handExceptions() throws Exception {
        Insurance insurance = new Insurance();
        insurance.getParentInsurance();
    }

}
