class Solution {
    public String reverseWords(String s) {
        String[]arr=s.trim().split("\\s+");
        String newstr=arr[arr.length-1];
        for(int i=arr.length-2; i>=0;i--){
            newstr+=" ";
            newstr+=arr[i];
        }
        return newstr;
    }
}