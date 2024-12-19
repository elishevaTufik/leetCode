class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double maxsum=0,sum=0;
		int i;
        
        if(nums.length<k)
        	return 0;
        
        for (i = 0; i < k; i++) 
        	sum+=nums[i];
        
        maxsum=sum;

        for (; i < nums.length; i++) 
        {
        	sum+=nums[i]-nums[i-k];
        	maxsum=Math.max(maxsum, sum);
        }
     	
		return maxsum/k;
    }
}