// Last updated: 20/05/2026, 23:06:55
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int currentSum = nums[0];
4
5        int maxSum = nums[0];
6
7        for (int i = 1; i < nums.length; i++) {
8            currentSum = Math.max(nums[i], currentSum + nums[i]);
9            maxSum = Math.max(maxSum, currentSum);
10        }
11        return maxSum;
12    }
13}