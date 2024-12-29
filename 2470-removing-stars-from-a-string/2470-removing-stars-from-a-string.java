class Solution {
    public String removeStars(String s) {
       Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (c == '*') {
            // הסר את התו האחרון במחסנית אם יש כוכבית
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } else {
            // הוסף תו רגיל למחסנית
            stack.push(c);
        }
    }

    // בניית המחרוזת מהמחסנית
    StringBuilder result = new StringBuilder();
    while (!stack.isEmpty()) {
        result.insert(0, stack.pop());
    }

    return result.toString();
    }
}