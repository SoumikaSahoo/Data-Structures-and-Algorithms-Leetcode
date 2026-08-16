class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        class Pair {
            int first;
            int second;
            Pair(int f,int s){
                first=f;
                second=s;
            }
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if(a.first!=b.first) return a.first-b.first;
            return a.second - b.second;
        });
        HashMap <Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            pq.add(new Pair(map.get(num),num));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[]ans =new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().second;
        }
        return ans;
    }
}