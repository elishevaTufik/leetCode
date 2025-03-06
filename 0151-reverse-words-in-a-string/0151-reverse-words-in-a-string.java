class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        int i=i = arr.length - 1;
        for (; i > 0; i--) {
            res.append(arr[i]);
            res.append(" ");
        }
        res.append(arr[i]);
        return res.toString();
    }
}