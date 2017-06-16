package isoForum.tryMonad;

public interface TrySupplier<T> {
    T get() throws Throwable;
}
