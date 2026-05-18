// Last updated: 18/05/2026, 23:37:18
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3
4        int idx = m + n - 1;
5        int i = m - 1;
6        int j = n - 1;
7
8        while (i >= 0 && j >= 0) {
9
10            if (nums1[i] >= nums2[j]) {
11                nums1[idx--] = nums1[i--];
12            } else {
13                nums1[idx--] = nums2[j--];
14            }
15        }
16        
17        while (j >= 0) {
18            nums1[idx--] = nums2[j--];
19        }
20    }
21}