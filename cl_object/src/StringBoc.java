public class StringBoc {
  private char[] character;
  //new String
  public StringBoc(String s) {
    //s -> char[]
    this.character = new char[s.length()];
    for(int i = 0; i < s.length(); i++) {
      this.character[i] = s.charAt(i);

    }
  }
  public char charAt(int index) {
    return this.character[index];
  }
  public int length() {
    return this.character.length;
  }
  public int indexof(char c) {
    for(int i = 0; i < this.character.length; i++){
      if(this.character[i] == c){
        return i;
      }
    }return -1;
  }
    public String replace(char o, char n){ // replace('c','x')
      char[] arr = new char[this.character.length];
     for(int i = 0; i < this.character.length; i++){
       arr[i] = this.character[i] == o ? n : this.character[i];
      }
      return String.valueOf(arr); // new String arr
    }
    public String toString() {
      return String.valueOf(this.character);
    }
    //public String subString(int beginIndex, int endIndex){}


}
