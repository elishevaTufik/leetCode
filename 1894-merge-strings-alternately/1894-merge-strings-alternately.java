class Solution {
    
     public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        StringBuilder newstr = new StringBuilder(len1 + len2);

        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            newstr.append(word1.charAt(i++));
            newstr.append(word2.charAt(j++));
        }

        if (i < len1) {
            newstr.append(word1.substring(i));
        } else if (j < len2) {
            newstr.append(word2.substring(j));
        }
        return newstr.toString();
    }
}