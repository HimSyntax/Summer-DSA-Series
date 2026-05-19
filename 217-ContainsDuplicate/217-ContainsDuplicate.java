// Last updated: 19/05/2026, 23:17:36
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set <Integer> set = new HashSet<>();
4        for(int i=0; i<nums.length; i++){
5            if(set.contains(nums[i])){
6                return true;
7            }
8            set.add(nums[i]);
9            }
10            return false;
11        }
12    }