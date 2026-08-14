class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        int left=0;
        HashMap <Integer,Integer>map=new HashMap<>();
        for(int right=0;right<nums.length;right++){
     int num=nums[right];
     map.put(num,map.getOrDefault(num,0)+1);
     while(map.get(num)>k) {
        int remove=nums[left];
        map.put(remove,map.get(remove)-1);
        left++;
     }
     int length=right-left+1;
     if(length>max){
        max=length;
     }
        }
        return max;
     
    }
}