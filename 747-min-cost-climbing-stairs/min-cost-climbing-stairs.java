class Solution {
    int[]dp;
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return mincost(cost,n);
    }
    int mincost(int[] cost,int n){
        if(n<=1)return 0;
        if(dp[n]!=-1) return dp[n];
    return dp[n]=Math.
        min(cost[n-1]+mincost(cost,n-1),cost[n-2]+mincost(cost,n-2));
    }
}