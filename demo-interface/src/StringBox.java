public class StringBox implements CharSequence {
    private char[] characters;
  
    public StringBox() {
      this.characters = new char[0];
    }
  
    public StringBox(String s) {
      this.characters = s.toCharArray();
    }
  
    @Override
    public int length() {
      return this.characters.length;
    }
  
    @Override
    public char charAt(int index) {
      return this.characters[index];
    }
  
    // Method Signature: subSequence(int start, int end)
    @Override
    public StringBox subSequence(int start, int end) { // 0, 3 -> 0, 2
      char[] arr = new char[end - start]; // 3-0 -> idx 0-2
      int idx = 0;
      for (int i = start; i < end; i++) {
        arr[idx++] = this.characters[i];
      }
      return new StringBox(String.valueOf(arr));
    }
  
    public StringBox append(String s) {
      char[] arr =
          Arrays.copyOf(this.characters, this.characters.length + s.length());
      int idx = this.characters.length;
      for (int i = 0; i < s.length(); i++) {
        arr[idx++] = s.charAt(i);
      }
      return new StringBox(String.valueOf(arr));
    }
  
    @Override
    public String toString() {
      return String.valueOf(this.characters);
    }
  }
