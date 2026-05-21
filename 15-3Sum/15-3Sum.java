// Last updated: 21/05/2026, 23:26:26
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5
6        List<List<Integer>> res = new ArrayList<>();
7
8        Arrays.sort(nums);
9
10        for (int i = 0; i < nums.length - 2; i++) {
11
12            if (i > 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15
16            int left = i + 1;
17            int right = nums.length - 1;
18
19            while (left < right) {
20
21                int sum = nums[i] + nums[left] + nums[right];
22
23                if (sum == 0) {
24
25                    res.add(Arrays.asList(
26                            nums[i],
27                            nums[left],
28                            nums[right]
29                    ));
30
31                    while (left < right &&
32                           nums[left] == nums[left + 1]) {
33                        left++;
34                    }
35
36                    while (left < right &&
37                           nums[right] == nums[right - 1]) {
38                        right--;
39                    }
40
41                    left++;
42                    right--;
43
44                } else if (sum < 0) {
45                    left++;
46                } else {
47                    right--;
48                }
49            }
50        }
51
52        return res;
53    }
54}