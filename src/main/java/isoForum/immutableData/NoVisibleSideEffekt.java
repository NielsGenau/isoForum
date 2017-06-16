package isoForum.immutableData;

/**
 * Created by gen on 16.06.2017.
 */
public class NoVisibleSideEffekt {
    public static void stringsAreImmutable() {
        String name = "niels";
        name.replace('n', 'N');
    }
}
