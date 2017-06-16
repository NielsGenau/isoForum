package isoForum.exceptionHandling;

import static isoForum.exceptionHandling.WrongHandlingOfCheckedException.thirdPartyMethod;

/**
 * Created by gen on 16.06.2017.
 */
public class ProblemOfCheckExceptions {
    private void saveDataPart1() {

    }

    private void saveDataPart2() {

    }

    public void doSomeStuff() throws Exception {
        saveDataPart1();
        thirdPartyMethod();
        saveDataPart2();
    }


}
