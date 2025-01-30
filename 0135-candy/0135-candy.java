class Solution {
    public int candy(int[] ratings) {
        if(ratings.length==1)
            return 1;


        int[] candies = new int[ratings.length];

        for (int i = 0; i < ratings.length; i++) {
            candies[i] = 1;
        }

        // int count=ratings.length;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                // count+=candies[i - 1] + 1-candies[i];
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                // count+=Math.max(candies[i], candies[i + 1] + 1)-candies[i];
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int count=0;
        for (int i=0;i<candies.length;i++)
            count+=candies[i];
        return count;
    }
}