class Solution {
public:
    string reverseWords(string s) {
        vector<string> words;
        string word;
        istringstream iss(s);
        
        while (iss >> word) { 
            words.push_back(word);
        }
        
        reverse(words.begin(), words.end());
        
        string result;
        for (size_t i = 0; i < words.size(); ++i) {
            if (i > 0) {
                result += " ";
            }
            result += words[i];
        }
        
        return result;
    }
};