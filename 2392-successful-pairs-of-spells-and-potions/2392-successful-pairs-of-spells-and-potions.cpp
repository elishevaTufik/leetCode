class Solution {
public:
    vector<int> successfulPairs(vector<int>& spells, vector<int>& potions, long long success) {
        vector<int> result(spells.size());
        sort(potions.begin(), potions.end());
        
        for (int i = 0; i < spells.size(); i++) {
            long long requiredStrength = (success + spells[i] - 1) / spells[i]; 
            
            auto it = lower_bound(potions.begin(), potions.end(), requiredStrength);
            result[i] = potions.end() - it;
        }
        
        return result;
    }
};