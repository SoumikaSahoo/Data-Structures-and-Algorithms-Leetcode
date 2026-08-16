class Solution {
    public int findKthLargest(int[] arr, int k) {
        int n=arr.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            pq.add(arr[i]);

        }
        for(int i=k;i<n;i++){
            if(arr[i]<pq.peek()){
                continue;
            }
            pq.poll();
            pq.add(arr[i]);
        }
 return pq.peek();
    }
}