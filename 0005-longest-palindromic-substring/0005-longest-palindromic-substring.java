class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        String maxStr = "";

        for (int i = 0; i < s.length(); i++) {
            int left = i - 1, right = i + 1;
            String tmpStr = s.charAt(i) + "";
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    tmpStr = s.charAt(left) + tmpStr + s.charAt(right); 
                    left--;
                    right++;
                } else break;
            }
            if (tmpStr.length() > maxStr.length()) maxStr = tmpStr;

            left = i; right = i + 1;
            tmpStr = "";
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    tmpStr = s.charAt(left) + tmpStr + s.charAt(right);
                    left--;
                    right++;
                } else break;
            }
            if (tmpStr.length() > maxStr.length()) maxStr = tmpStr;
        }

        return maxStr;
    }
}
