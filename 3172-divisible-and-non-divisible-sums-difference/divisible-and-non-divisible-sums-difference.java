class Solution {
    public int differenceOfSums(int n, int m) {
        int k=n/m;
        int total=n*(n+1)/2;
        int divsum=(m*(k*(k+1)))/2;
        return total-2*divsum;
    }
}