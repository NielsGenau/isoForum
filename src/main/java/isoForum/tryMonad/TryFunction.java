package isoForum.tryMonad;

public interface TryFunction<T, R> {
    R apply(T throwable) throws Throwable;
}
