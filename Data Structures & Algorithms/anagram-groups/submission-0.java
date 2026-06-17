class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList(map.values());
        
    }
}
