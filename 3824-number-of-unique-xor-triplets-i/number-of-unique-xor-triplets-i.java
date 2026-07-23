class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2)return n;
        int highest=Integer.highestOneBit(n);
        return highest<<1;
    }
}