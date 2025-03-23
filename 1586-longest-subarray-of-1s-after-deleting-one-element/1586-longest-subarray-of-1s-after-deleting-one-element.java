class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length==1)
            return 0;

        int k=1;
        int max=0,zeros=0;

        for(int i=0,j=0;i<nums.length;){

            if(nums[i]==0)  
                zeros++;
                
            while (zeros > k) {
                if (nums[j] == 0) {
                    zeros--;
                }
                j++;
            }
            max = Math.max(max, (i - j + 1));
            i++;
        }
        return max-1;
    }
}