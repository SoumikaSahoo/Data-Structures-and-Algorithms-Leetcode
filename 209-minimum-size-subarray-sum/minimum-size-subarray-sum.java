class Solution {
    public int minSubArrayLen(int target, int[]a) {
        int n=a.length;
        int low=0;
        int high=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        while(high<n){
            sum=sum+a[high];
            while(sum>=target){
                int length=high-low+1;
                res=Math.min(res,length);
                sum=sum-a[low];
                low++;
            }
            high++;
            
        }
         return res == Integer.MAX_VALUE ? 0 : res;
    }
}