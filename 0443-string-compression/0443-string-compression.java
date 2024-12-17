class Solution {
    public int compress(char[] chars) {
    
    if(chars.length==1)
			return 1;

    int write = 0;
    int read = 0;   
        
    while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;
            
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }
            
            chars[write++] = currentChar;
            
            if (count > 1) {
                char[] str=String.valueOf(count).toCharArray();
                for (int i=0; i<str.length;i++) {
                    chars[write++] = str[i];
                }
            }
        }
        
        return write;
    }
}