package whydefault;
public interface Accessable {
  void read();

  default void write() {

  }
}