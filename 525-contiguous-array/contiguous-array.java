class Solution {
    public int findMaxLength(int[] nums) {
        int cntone=0;int cntzero=0;
        int ans=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)cntzero++;
            else{
                cntone++;
            }
            int diff=cntzero-cntone;
            if(diff==0){
                ans=Math.max(ans,i+1);
            }
if(map.containsKey(diff)){
    ans=Math.max(ans,i-map.get(diff));
}else{
    map.put(diff,i);
}
        }
        return ans;
    }
}