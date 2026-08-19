class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n=nums.length;
        int prefix=0;
        List<Boolean> result = new ArrayList<>(n); 
        for(int i=0;i<nums.length;i++){
           prefix=((prefix<<1)+nums[i])%5;
           result.add(prefix==0);

        }
        return result;

    }
}