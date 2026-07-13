class Solution {
  
        
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int left=0;
        int i=0;
        int sum=0;
        for(i=0;i<n;i++){
            sum=sum+nums[i];
        }
        for(i=0;i<n;i++){
           
            int right=sum-nums[i]-left;
            if(left==right){
                return i;
            }
            left=left+nums[i];
        }
        return -1;
    }
}
    