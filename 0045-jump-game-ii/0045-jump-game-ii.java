class Solution {
    public int jump(int[] nums) {
        
        if (nums.length==1)
            return 0;

        boolean[] reachable = new boolean[nums.length];
        reachable[0] = true;  
        
        int[] count = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (reachable[i]) {
                for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                    reachable[j] = true; 
                    if(count[j]==0)
                        count[j]=count[i]+1;
                } 
            }
        }

        return count[nums.length - 1]; 
    }
}