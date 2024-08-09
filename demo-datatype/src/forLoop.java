public class forLoop {
  public static void main(String[] args) {
      //two for loops
      String searchMe = "peter piper picked a peck of pickled peppes";
      int num = 0;

      for(int i = 0; i < searchMe.length(); i++){
       // if(searchMe.charAt(i) != 'p'){
         // continue;
         if(searchMe.charAt(i) == 'p'){
        
        num++;}
         
      }System.out.println("found" + num + "p's in the string.");// num = 6? 

  }
}
