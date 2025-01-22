class Solution {
    public String reverseWords(String s) {
    //     String[]arr=s.trim().split("\\s+");
    //     String newstr=arr[arr.length-1];
    //     for(int i=arr.length-2; i>=0;i--){
    //         newstr+=" ";
    //         newstr+=arr[i];
    //     }
    //     return newstr;
        String[] arr = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (int i = arr.length - 1; i >= 0; i--) {
            result.append(arr[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}