// Last updated: 19/05/2026, 23:53:54
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n = nums.length;
4        int[] prefixProductFromStart = new int[n], prefixProductFromEnd = new int[n], res = new int[n];
5
6        prefixProductFromStart[0] = nums[0];
7        for(int i=1; i<n; i++){
8            prefixProductFromStart[i] = prefixProductFromStart[i-1] * nums[i];
9        }
10        prefixProductFromEnd[n-1] = nums[n-1];
11        for(int i=n-2; i>=0; i--){
12            prefixProductFromEnd[i] = prefixProductFromEnd[i+1] * nums[i];
13        }
14        res[0] = prefixProductFromEnd[1];
15        res[n-1] = prefixProductFromStart[n-2];
16        for(int i=1; i<n-1; i++){
17            res[i] = prefixProductFromStart[i-1] * prefixProductFromEnd[i+1];
18        }
19        return res;
20    }
21    }
22
23