class Solution {
    public boolean canJump(int[] nums) {
        
        if (nums.length==1)
            return true;

        boolean[] reachable = new boolean[nums.length];
        reachable[0] = true;  
        
        for (int i = 0; i < nums.length; i++) {
            if (reachable[i]) { 
                for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                    reachable[j] = true; 
                }
            }
        }

        return reachable[nums.length - 1]; 
    }
}