import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);  // Get each character
            
            // If opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If closing bracket and stack is empty, it's invalid
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();  // Top of stack

                // Check if the closing bracket matches
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        // Stack should be empty if all brackets matched
        return stack.isEmpty();
    }
}
