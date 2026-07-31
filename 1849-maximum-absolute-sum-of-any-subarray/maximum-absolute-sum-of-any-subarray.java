class Solution {
    public int maxAbsoluteSum(int[] nums) {
int maxsum=maxSubArray(nums);
int minsum=smallestSumSubarray(nums);
return Math.max(Math.abs(maxsum),Math.abs(minsum));
        
    }
     private int maxSubArray(int[] nums) {
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
     private int smallestSumSubarray(int nums[]) {
       int i=0;

    int size=nums[0];
     int ans=nums[0];
     for(i=1;i<nums.length;i++){
        int b1=size+nums[i];
        int b2=nums[i];
        size=Math.min(b1,b2);
        ans=Math.min(size,ans);
     }
     return ans;
        
    }
}