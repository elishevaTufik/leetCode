public class Solution {
    public int PivotIndex(int[] nums) {
        
        int totalSum = 0, leftSum = 0;

        foreach (int num in nums)
        {
            totalSum += num;
        }
              
        for (int i = 0; i < nums.Length; i++)
        {
            if (leftSum == totalSum - leftSum - nums[i])
            {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;


    }
}