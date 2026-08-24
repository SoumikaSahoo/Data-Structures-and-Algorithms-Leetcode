class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        int left=0;
       
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        for(int i=0;i<n;i++){
            int right=sum-nums[i]-left;
        
        if(left==right){
             return i;
        }
        left=left+nums[i];
        }
        return -1;
    }
}