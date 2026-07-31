class Solution {
    public int maxSubArray(int[] nums) {
     int i=0;
     int bestans=nums[0];
     int ans=nums[0];
     for(i=1;i<nums.length;i++){
        int b1=bestans+nums[i];
        int b2=nums[i];
        bestans=Math.max(b1,b2);
        ans=Math.max(bestans,ans);
     }
     return ans;
    }
}