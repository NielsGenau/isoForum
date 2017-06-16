package isoForum.tryMonad;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface Try<T> {
    T get();
    boolean isSuccess();
    boolean isFailure();
    <U> Try<U> map(TryFunction<? super T, U> function);
    <U> Try<U> flatMap(TryFunction<? super T, Try<U>> function);
    Try<T> filter(Predicate<? super T> predicate);
    T getOrElse(Supplier<T> function);
    T getOrElse(T value);
    Try<T> orElse(Supplier<Try<T>> function);
    Optional<T> toOptional();
}
