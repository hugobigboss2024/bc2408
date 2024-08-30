public class Test3{
    public static int findPermutationDifference(String s, String t) {
        /* int sum = 0;
         for(int i = 0; i < s.length(); i++){
             for(int j = 0; j < t.length(); j++){
                 if(s.)
                 sum++;
             }
         }return sum;*/
         int sum = 0;
         for(int i = 0; i < s.length(); i++)
         {
             int j = t.indexOf(s.charAt(i));
             sum+=Math.abs(i-j);
         }
         return sum;
     }
     public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
     }
}