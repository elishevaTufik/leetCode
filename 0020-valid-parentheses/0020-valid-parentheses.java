// import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;

                case ')':
                    if (!checkMatch(stack, '(')) return false;
                    break;

                case '}':
                    if (!checkMatch(stack, '{')) return false;
                    break;

                case ']':
                    if (!checkMatch(stack, '[')) return false;
                    break;

                default:
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public boolean checkMatch(Stack<Character> stack, char expected) {
        return !stack.isEmpty() && stack.pop() == expected;
    }
}
