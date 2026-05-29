// Last updated: 29/05/2026, 22:00:04
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        
4        HashMap<String, List<String>> map = new HashMap<>();
5        for(String word : strs){
6            char[] arr = word.toCharArray();
7            Arrays.sort(arr);
8
9            String key = new String(arr);
10
11            if(!map.containsKey(key)){
12                map.put(key, new ArrayList<>());
13            }
14            map.get(key).add(word);
15        }
16        return new ArrayList<>(map.values());
17    }
18}