class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int nodelete=arr[0];
        int onedelete=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            int prevdelete=nodelete;
            nodelete=Math.max(arr[i],nodelete+arr[i]);
            onedelete=Math.max(onedelete+arr[i],prevdelete);
            res=Math.max(res,(Math.max(nodelete,onedelete)));
        }
        return res;
        
    }
}