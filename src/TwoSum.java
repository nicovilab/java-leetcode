/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109

 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }

    /*
    Optimal solution:
    public int[] twoSum(int[] nums, int target) {
        //Time: O(n) -> just 1 for loop (if theres n numers ill potentially look each one once)
        //Space O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int cur = nums[i];
            //cur + x = target ---> x = target - cur
            int x = target-cur;
            if(map.containsKey(x)){
                return new int[] {map.get(x), i};
            }
            map.put(cur,i);
        }
        return null;
    }


     */

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        //Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum.twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

        // Example2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum.twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

        // Example3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum.twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
    }
}


