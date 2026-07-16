class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int max=0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[i];
        }
        max=sum;
        for(int i=1;i<=k;i++){
            sum=sum-cardPoints[k-i];
            sum=sum+cardPoints[n-i];
            max=Math.max(max,sum);
        }
        return max;
    }
}