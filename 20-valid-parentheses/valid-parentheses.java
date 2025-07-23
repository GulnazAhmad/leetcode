class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean ans=false;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                char c=stack.pop();
                
                if(c=='(' && s.charAt(i)==')'){
                    ans=true;
                    continue;
                }
                if(c=='[' && s.charAt(i)==']'){
                    ans=true;
                    continue;

                }
                if(c=='{' && s.charAt(i)=='}'){
                    ans=true;
                    continue;
                }
                }
            ans=false;
            return ans;
                
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return ans;

    }
}