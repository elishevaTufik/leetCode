class Solution {
    public int maxArea(int[] height) {
        
        int sum=0, max=0;

        for(int i=0, j=height.length-1;i<=j;){
            
            sum=(Math.min(height[i],height[j]))*(j-i);
            if (sum>max){
                max=sum;
            }
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}