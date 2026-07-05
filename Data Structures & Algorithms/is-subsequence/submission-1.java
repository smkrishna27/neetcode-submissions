class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() > t.length()) return false;
        if (s.isEmpty()) return true;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        int i = 0;
        int j = 0;
        while (i < sArray.length && j < tArray.length) {
            if (sArray[i] == tArray[j]) {
                i++;
                j++;

            } else {
                j++;
            }
            if (i == sArray.length) {
                return true;
            }

        }

        return false;
        
    
    }
}