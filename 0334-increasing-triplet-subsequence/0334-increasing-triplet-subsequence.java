class Solution {
    public boolean increasingTriplet(int[] nums) {
         if (nums.length < 3) {
		        return false; 
		 }

		 int first = Integer.MAX_VALUE;
		 int second = Integer.MAX_VALUE;
		 System.out.println(first);
		 System.out.println(second);
		 
		 for (int i=0;i<nums.length;i++){
		        
			if (nums[i]<= first) {
		            first = nums[i] ;
		        } 
	        else if (nums[i]<= second){
	            second = nums[i];
		        } 
		        else {
		            return true;
		        }
		    }

		    return false; 
    }
}