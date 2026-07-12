class Solution {
    public int lengthOfLIS(int[] a) {
        int n = a.length;
        int[][]dp=new int[n+1][n+1];
       
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
         return fun(a,0,a.length,-1,dp);

    }
    public int fun(int[]a,int i,int n,int prev,int[][]dp){
      
        if(i==n){
            return 0;
        }
        if (dp[i][prev + 1] != -1) {
    return dp[i][prev + 1];
}
        if(prev==-1||a[i]>a[prev]) {
            int c1=1+fun(a,i+1,n,i,dp);
            int c2=fun(a,i+1,n,prev,dp);
            return dp[i][prev + 1] =Math.max(c1,c2);
        }
 return dp[i][prev + 1] =fun(a,i+1,n,prev,dp);

    }
}