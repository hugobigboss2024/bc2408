public class JavaQuest12 {
  public static int[] twoSum(int[] nums, int target) {
    // 遍歷數組
    for (int i = 0; i < nums.length; i++) {
        // 遍歷剩餘的數字
        for (int j = i + 1; j < nums.length; j++) {
            // 如果兩個數字的和等於目標,返回它們的索引
            if (nums[i] + nums[j] == target) {
                return new int[] { i, j };
            }
        }
    }
   return new int[] { -1, -1 };
}
  public static void main(String[] args) {
    int[] answers = twoSum(new int[] { 2, 7, 11, 15 }, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = twoSum(new int[] { 3, 2, 4 }, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = twoSum(new int[] { 3, 3 }, 7); // {3, 3} is the dataset, 7 is the target to sum
  }
  
}
