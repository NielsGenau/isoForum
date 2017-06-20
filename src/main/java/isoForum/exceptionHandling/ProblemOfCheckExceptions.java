package isoForum.exceptionHandling;

import static isoForum.exceptionHandling.WrongHandlingOfCheckedException.thirdPartyMethod;

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
