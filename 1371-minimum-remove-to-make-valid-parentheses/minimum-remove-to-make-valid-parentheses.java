class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        
        int maxLen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
            st.push(i);                 // ③ push index of '('
            } 
            else if(s.charAt(i)==')') {
                               // ④ pop matching '(' or last invalid
            if (!st.isEmpty() && s.charAt(st.peek())=='(') {
                st.pop();          // ⑤ mark new base
            }
            else{
                st.push(i); 
            } 
        }
        
    }
    while(!st.isEmpty()){
            int x=st.pop();
            sb.deleteCharAt(x);
        }
    s=sb.toString();
    return s;
}
}