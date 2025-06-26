class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();   // ① stack to hold last invalid or '(' indices
    st.push(-1);                         // ② base index before valid substring
    int maxLen = 0;
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            st.push(i);                 // ③ push index of '('
        } else {
            st.pop();                   // ④ pop matching '(' or last invalid
            if (st.isEmpty()) {
                st.push(i);            // ⑤ mark new base
            } else {
                maxLen = Math.max(maxLen, i - st.peek());  // ⑥ calculate length
            }
        }
    }
    return maxLen;
        
    }
}