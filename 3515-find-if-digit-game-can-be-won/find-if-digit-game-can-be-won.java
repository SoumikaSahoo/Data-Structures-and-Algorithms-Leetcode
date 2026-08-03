class Solution {
    public boolean canAliceWin(int[] nums) {
        int i,count1=0,count2=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]< 10){
                count1=count1+nums[i];
            }else{
                count2=count2+nums[i];
            }
        }
        return count2!=count1;
    }
}