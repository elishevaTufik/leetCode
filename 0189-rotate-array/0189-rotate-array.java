class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length<k)
                k=k%nums.length;
        
        if(nums.length==k || k==0)
            return;

        int[] copy = nums.clone();
        int j=k,i=0;
        
        for(; j<nums.length;i++,j++)
            nums[j]=copy[i];
        
        for(j=0; j<k;i++,j++)
            nums[j]=copy[i];        
    }
}