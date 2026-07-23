class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int[]copy=nums.clone();
        Arrays.sort(copy);
        int left=0;
        while(left<n &&nums[left]==copy[left]){
            left++;
        }
        if(left==n){
            return 0;
        }
        int right=n-1;
        while(right>=0&& nums[right]==copy[right]){
            right--;
        }
        return right-left+1;
    }
}