package isoForum.exceptionHandling;


public class WrongHandlingOfCheckedException {
    public static void  thirdPartyMethod() throws Exception {
       throw new Exception();
    }

    public void handleException() {
        try {
            thirdPartyMethod();
        } catch (Exception e) {
            // das sollte nie passieren
        }
    }

    public void throwRuntimeException() {
        try {
             thirdPartyMethod();
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }

    public void bubleException() throws Exception {
        thirdPartyMethod();
    }
}
