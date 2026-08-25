class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        long [] sum =new long [n+1];
        
        for(int i=0;i<n;i++){
            sum[i+1]=sum[i]+nums[i];
        }
        Deque<Integer>dq=new ArrayDeque<>();
        int ans=n+1;
        for(int i = 0; i <= n; i++){
            while(!dq.isEmpty()&& sum[i]-sum[dq.peekFirst()]>=k){
                 int index = dq.pollFirst();
                     ans = Math.min(ans, i - index);
            }
             while (!dq.isEmpty() &&
                   sum[i] <= sum[dq.peekLast()]) {

                dq.pollLast();

        }
        dq.offerLast(i);
    }
     if (ans == n + 1) {
            return -1;
        }

        return ans;
    }


}