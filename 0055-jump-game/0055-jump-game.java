class Solution {
    public boolean canJump(int[] nums) {
        
        if (nums.length==1)
            return true;

        int canGo=0;

        for(int i=0;i<nums.length;i++){
            if(canGo<0)
                return false;
            else{
                if(nums[i]>canGo)
                    canGo=nums[i];
            }
            canGo--;
        }
        return true;
    }
}