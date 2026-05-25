// Last updated: 25/05/2026, 22:06:24
1class Solution {
2    public boolean isValid(String s) {
3
4        Stack<Character> st = new Stack<>();
5        for (char ch : s.toCharArray()) {
6            if (ch == '(' || ch == '{' || ch == '[') {
7                st.push(ch);
8            } 
9            else {
10                if (st.isEmpty()) {
11                    return false;
12                }
13
14                if (ch == ')' && st.pop() != '(') {
15                    return false;
16                }
17                if (ch == '}' && st.pop() != '{') {
18                    return false;
19                }
20                if (ch == ']' && st.pop() != '[') {
21                    return false;
22                }
23            }
24        }
25
26        return st.isEmpty();
27    }
28}