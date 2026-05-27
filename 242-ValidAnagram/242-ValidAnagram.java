// Last updated: 27/05/2026, 22:04:24
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char [] a = s.toCharArray();
4        char [] b = t.toCharArray();
5
6        java.util.Arrays.sort(a);
7        java.util.Arrays.sort(b);
8
9        return java.util.Arrays.equals(a,b);
10
11    }
12}