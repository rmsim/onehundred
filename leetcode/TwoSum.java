/*
 * Brute Force Method
 * Time complexity: O(n^2)
 * Because for each element, we try to find its complement by looping
 * the rest of the array in O(n) time. Inner loop = n, outerloop = n.
 * 
 * Space complexity: O(1)
 */
class TwoSum {

  public int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          return new int[] {i, j};
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
