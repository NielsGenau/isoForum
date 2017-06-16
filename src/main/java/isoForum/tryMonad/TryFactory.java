package isoForum.tryMonad;

import java.util.function.Supplier;


public final class TryFactory {
    public static <T> Try<T> attempt(TrySupplier<T> function) {
        try {
            return new Success(function.get());
        } catch(Throwable throwable) {
            return new Failure(throwable);
        }
    }
}
