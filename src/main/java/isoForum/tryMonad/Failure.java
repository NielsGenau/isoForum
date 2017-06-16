package isoForum.tryMonad;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Failure<T> implements Try<T> {
    private final Throwable throwable;


    public Failure(Throwable throwable) {
        this.throwable = throwable;
    }


    @Override
    public T get() {
        throw  new RuntimeException(throwable);
    }


    @Override
    public boolean isSuccess() {
        return false;
    }


    @Override
    public boolean isFailure() {
        return true;
    }


    @Override
    public <U> Try<U> map(TryFunction<? super T, U> function) {
        return (Try<U>) this;
    }


    @Override
    public <U> Try<U> flatMap(TryFunction<? super T, Try<U>> function) {
        return (Try<U>) this;
    }


    @Override
    public Try<T> filter(Predicate<? super T> predicate) {
        return this;
    }


    @Override
    public T getOrElse(Supplier<T> function) {
        return function.get();
    }


    @Override
    public T getOrElse(T value) {
        return value;
    }


    @Override
    public Try<T> orElse(Supplier<Try<T>> function) {
        return function.get();
    }


    @Override
    public Optional<T> toOptional() {
        return Optional.empty();
    }
}
