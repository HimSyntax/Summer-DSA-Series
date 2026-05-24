// Last updated: 24/05/2026, 22:21:17
1class Solution {
2    public void rotate(int[][] matrix) {
3
4        int n = matrix.length;
5
6        // transpose
7        for(int i = 0; i < n; i++) {
8            for(int j = i; j < n; j++) {
9
10                int temp = matrix[i][j];
11                matrix[i][j] = matrix[j][i];
12                matrix[j][i] = temp;
13            }
14        }
15
16        // reverse rows
17        for(int i = 0; i < n; i++) {
18            for(int j = 0; j < n/2; j++) {
19
20                int temp = matrix[i][j];
21                matrix[i][j] = matrix[i][n-1-j];
22                matrix[i][n-1-j] = temp;
23            }
24        }
25    }
26}