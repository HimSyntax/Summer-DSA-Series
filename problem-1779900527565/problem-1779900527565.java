// Last updated: 27/05/2026, 22:18:47
1class Solution {
2    public int[] limitOccurrences(int[] nums, int k) {
3        ArrayList<Integer>ans = new ArrayList<>();
4        int count = 1;
5        ans.add(nums[0]);
6
7        for(int i=1; i<nums.length; i++){
8            if(nums[i] == nums[i-1]){
9                count++;
10            } else{
11                count=1;
12            }
13            if(count<=k){
14                ans.add(nums[i]);
15            }
16        }
17        int[]result = new int[ans.size()];
18        for(int i=0; i<ans.size(); i++){
19             result[i] = ans.get(i);
20        }
21        return result;
22    }
23}