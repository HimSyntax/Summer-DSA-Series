// Last updated: 23/05/2026, 17:50:49
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProductFromStart = new int[n], prefixProductFromEnd = new int[n], res = new int[n];

        prefixProductFromStart[0] = nums[0];
        for(int i=1; i<n; i++){
            prefixProductFromStart[i] = prefixProductFromStart[i-1] * nums[i];
        }
        prefixProductFromEnd[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            prefixProductFromEnd[i] = prefixProductFromEnd[i+1] * nums[i];
        }
        res[0] = prefixProductFromEnd[1];
        res[n-1] = prefixProductFromStart[n-2];
        for(int i=1; i<n-1; i++){
            res[i] = prefixProductFromStart[i-1] * prefixProductFromEnd[i+1];
        }
        return res;
    }
    }

