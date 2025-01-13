public class Solution {
    public int LargestAltitude(int[] gain) {
        int highestAltitude = 0;
        int currentAltitude = 0;

        foreach (int g in gain)
        {
            currentAltitude += g;
            highestAltitude = Math.Max(highestAltitude, currentAltitude);
        }

        return highestAltitude;
    }
}