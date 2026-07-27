class Solution {
    public int maxProduct(int[] nums) {
        int a=0;
        int b=0;
        for(int num:nums){
            int old=a;
            a=Math.max(a,num);
            b=Math.max(b,Math.min(old,num));
        }
        return (a-1)*(b-1);
    }
}