class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int arr[] =new int[100];
        int res=0;
        for(int[] num:dominoes){
            int a=num[0];
            int b=num[1];
            int key=Math.min(a,b)*10+Math.max(a,b);
            res=res+arr[key];
            arr[key]++;
        }
        return res;
    }
}