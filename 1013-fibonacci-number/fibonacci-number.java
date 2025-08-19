class Solution {
    private int[] dp;
    public int fib(int n) {
        dp=new int[n+1];
        return helper(n);
        
    }
    public int helper(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=0){
            return dp[n];
        }
        return helper(n-1)+helper(n-2);
    }
}