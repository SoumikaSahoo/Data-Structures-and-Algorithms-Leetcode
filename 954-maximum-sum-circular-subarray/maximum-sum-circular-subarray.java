class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         int i=0;
         int n=nums.length;
     int bestans=nums[0];
     int ans1=nums[0];
     for(i=1;i<nums.length;i++){
        int b1=bestans+nums[i];
        int b2=nums[i];
        bestans=Math.max(b1,b2);
        ans1=Math.max(bestans,ans1);
     }
    
       
    int size=nums[0];
     int ans2=nums[0];
     for(i=1;i<nums.length;i++){
        int b1=size+nums[i];
        int b2=nums[i];
        size=Math.min(b1,b2);
        ans2=Math.min(size,ans2);
     }
   int sum=0;
   for(i=0;i<n;i++){
    sum=sum+nums[i];
   }

if(sum==ans2){
    return ans1;
}else{
    int circular=sum-ans2;
   

 return Math.max(ans1,circular);
    }
}
}