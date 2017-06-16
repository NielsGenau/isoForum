package isoForum.tryMonad;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Success<T> implements Try<T> {

    private final T value;


    public Success(T value) {
        this.value = value;
    }


    @Override
    public T get() {
        return value;
    }


    @Override
    public boolean isSuccess() {
        return true;
    }


    @Override
    public boolean isFailure() {
        return false;
    }


    @Override
    public <U> Try<U> map(TryFunction<? super T, U> function) {
        return null;
    }


    @Override
    public <U> Try<U> flatMap(TryFunction<? super T, Try<U>> function) {
        try {
            return function.apply(get());
        } catch (Throwable throwable) {
            return new Failure(throwable);
        }
    }


    @Override
    public Try<T> filter(Predicate<? super T> predicate) {
        return (predicate.test(get())) ? this : new Failure(new NoSuchElementException());
    }


    @Override
    public T getOrElse(Supplier<T> function) {
        return get();
    }


    @Override
    public T getOrElse(T value) {
        return get();
    }


    @Override
    public Try<T> orElse(Supplier<Try<T>> function) {
        return this;
    }


    @Override
    public Optional<T> toOptional() {
        return Optional.ofNullable(value);
    }
}
