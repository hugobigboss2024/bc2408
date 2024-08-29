package shape;

public enum Color { // implicit final
  //
  RED('R'), YELLOW('Y'), GREEN('G'),;

  //
  private char value;

  private Color(char value) {
    this.value = value;
  }
}
