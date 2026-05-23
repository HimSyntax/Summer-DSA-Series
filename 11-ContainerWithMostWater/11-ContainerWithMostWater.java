// Last updated: 23/05/2026, 18:18:39
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4
5        int right = height.length - 1;
6
7        int max = 0;
8
9        while (left < right) {
10
11            int width = right - left;
12
13            int h = Math.min(height[left], height[right]);
14
15            max = Math.max(max, width * h);
16
17            if (height[left] < height[right]) {
18
19                left++;
20
21            } else {
22
23                right--;
24
25            }
26
27        }
28
29        return max;
30    }
31}