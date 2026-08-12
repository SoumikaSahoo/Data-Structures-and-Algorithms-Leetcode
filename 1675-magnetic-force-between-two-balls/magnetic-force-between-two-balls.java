class Solution {
    public int maxDistance(int[] arr, int k) {
          int n=arr.length;
           Arrays.sort(arr);

        int low = 1;
        int high = arr[n - 1] - arr[0];
        int res = -1;

        while(low <= high) {

            int guess = low + (high - low) / 2;

            if(h(arr, n, k, guess)) {
                res = guess;
                low = guess + 1;
            } else {
                high = guess - 1;
            }
        }

        return res;
    }
     public boolean h(int[] arr, int n, int k, int guess) {
         int h=1;
       int prev=arr[0];
       for(int i=1;i<n;i++){
           int dis=arr[i]-prev;
           if(dis<guess){
               continue;
           }
           h++;
           prev=arr[i];
       }
       if(h>=k){
           return true;
       }
       else{
           return false;
       }
        
    }
    
}