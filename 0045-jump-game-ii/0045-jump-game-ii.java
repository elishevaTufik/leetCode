class Solution {
    public int jump(int[] nums) {
        
        if (nums.length==1)
            return 0;

        int[] count = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j <= i + nums[i] && j < nums.length; j++) {
                    if(count[j]==0)
                        count[j]=count[i]+1;
                } 
        }

        return count[nums.length - 1]; 
    }
}