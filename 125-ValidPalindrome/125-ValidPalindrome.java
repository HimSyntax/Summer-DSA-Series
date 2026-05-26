// Last updated: 26/05/2026, 22:03:55
1class Solution {
2    public boolean isPalindrome(String s) {
3
4        String str = "";
5
6        for(int i = 0; i < s.length(); i++) {
7            char ch = Character.toLowerCase(s.charAt(i));
8            if(Character.isLetterOrDigit(ch)) {
9                str = str + ch;
10            }
11        }
12
13        int i = 0 ;
14        int j = str.length()-1;
15        while(i < j) {
16            if(str.charAt(i) != str.charAt(j)) {
17                return false;
18            }
19            i++;
20            j--;
21        }
22        return true;
23    }
24}