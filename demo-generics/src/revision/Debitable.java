package demo-generics.src.revision;

public interface Debitable<T> {
    boolean debit(T value);
}
