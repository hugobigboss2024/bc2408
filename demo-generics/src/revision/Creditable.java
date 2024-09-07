package demo-generics.src.revision;

public interface Creditable<T> {
    void credit(T value);
}