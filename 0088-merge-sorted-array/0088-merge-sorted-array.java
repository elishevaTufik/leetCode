class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ind=nums1.length-1, i=m-1, j=n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
                nums1[ind--]=nums1[i--];

            else{

                if(nums1[i]<nums2[j])
                    nums1[ind--]=nums2[j--];
                else
                {
                    nums1[ind--]=nums2[j--];
                    nums1[ind--]=nums1[i--];
                }
            }               
        }
        if(i>=0)
        {
            for(;i>=0;i--){
                nums1[ind--]=nums1[i];
            }
        }

        if(j>=0)
        {
            for(;j>=0;j--){
                nums1[ind--]=nums2[j];
            }
        }
    }
}