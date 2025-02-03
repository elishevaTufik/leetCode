public class Solution {
    public int LargestAltitude(int[] gain) {
        int highestAltitude = 0;
        int currentAltitude = 0;
        int len=gain.Length;
        for(int i=0;i<len;i++){
            currentAltitude += gain[i];
            highestAltitude = Math.Max(highestAltitude, currentAltitude);
        }
        // foreach (int g in gain)
        // {
        //     currentAltitude += g;
        //     highestAltitude = Math.Max(highestAltitude, currentAltitude);
        // }

        return highestAltitude;
    }
}