// Last updated: 29/05/2026, 22:06:36
1class Solution {
2    public String longestPalindrome(String s) {
3        
4        String ans = "";
5        for(int i=0; i<s.length(); i++){
6            String a = expand(s,i,i);
7            String b = expand(s,i,i+1);
8
9            if(a.length()>ans.length()){
10                ans = a;
11            }
12            if(b.length()>ans.length()){
13                ans = b;
14            }
15        }
16        return ans;
17    }
18    public String expand(String s, int left, int right){
19        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
20            left--;
21            right++;
22        }
23        return s.substring(left+1,right);
24    }
25}