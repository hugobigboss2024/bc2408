public class idea_st {
public static void main(String[] args) {
  int sum = 0;
  for(int i = 1; i <= 100; i ++){
    if(i % 2 ==0){
     sum = sum + 1;
    }
  }System.out.println(sum);
  /*//4 prople how old
  int[] arr1 = new int[]{11,12,13,14};
  //4 proples names
  String[] arr2 = new String[]{"lee","ken","kc","mimi"};
  //4 people how tall
  double[] arr3 = new double[]{1.5,1.6,1.7,1.8};*/
  int[] arr = {1,2,3,4,5,};
  for(int i = 0; i < arr.length; i++){
    System.out.println(arr[i]);
  }
  int[] arr1 = new int[]{1,2,3,4,5};
  int sum1 = 0;
  for(int i = 0; i < arr1.length; i++){
  sum1 = sum1 + arr1[i];
  }System.out.println(sum1);
  /////////////////////////////
  int[] arr2 = new int[]{1,2,3,4,5,6,7,8,9,10};
  int sum2 = 0;
  for(int i = 0; i < arr2.length; i++){
    if(arr2[i] % 3 == 0){
      sum2++; 
    }
  }System.out.println(sum2);
  ////////////////////////////
  int[] arr3 = {33,5,22,44,55};
  int max = arr3[0];
  for( int i = 0; i < arr3.length; i++){
    if(arr3[i] > max){
      max = arr3[i];
    }
  }System.out.println(max);

}
}