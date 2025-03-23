class Solution {
    public int longestOnes(int[] nums, int k) {
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

        return max;
    }
}