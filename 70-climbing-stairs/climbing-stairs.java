class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return climb(n,dp);
    }
    private int climb(int n,int[] dp){
        
        if(n==1) return 1;
        if(n==0) return 1;
                if (dp[n] != 0) return dp[n];  // ✅ Memoization check

        dp[n]=climb(n-1,dp)+climb(n-2,dp);
        return dp[n];

            
    }
}