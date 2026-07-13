class Solution {
    public int lengthOfLIS(int[] a) {
        int n = a.length;
  int ans=1;
          int[] res = new int[n];
        Arrays.fill(res, 1);

            for (int i = 0; i < n; i++) {
            for(int j=0;j<i;j++){
                if(a[j]<a[i]){
                    res[i]=Math.max(res[i],res[j]+1);
                }
            }
           
       
                ans=Math.max(ans,res[i]);
                
            }
        
        return ans;
    }
}