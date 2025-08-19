class Solution {
    private int[] dp;
    public int climbStairs(int n) {
        //now with memoization
        dp=new int[n+1];
        return helper(n);
    }
        private int helper(int n){
            if(n==0){
                return 1;
            }
            if(n==1){
                return 1;
            }
            if(dp[n]!=0){//if already stored then return it
                return dp[n];
            }
            dp[n]=helper(n-1)+helper(n-2);
            return dp[n];
        }
        
        
    
}