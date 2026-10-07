class Solution {
    public int[] sortedSquares(int[] nums) {
  int n=nums.length;
  int left=0;
  int ans[]=new int[n];
  int right=n-1;
  int index=n-1;
 while(left<=right){
    int leftsquared=nums[left]*nums[left];
    int rightsquared=nums[right]*nums[right];
    if(leftsquared>rightsquared){
        ans[index]=leftsquared;
        left++;
    }
    else {
        ans[index]=rightsquared;
        right--;
    }
    index--;
    
 }
 return ans;

  }

    }
