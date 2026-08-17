class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n=words.length;
        class Pair{
            int first;
            String second;
            Pair(int f,String s){
                first=f;
                second=s;
            }
        }
          PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            if(a.first!=b.first) return a.first-b.first;
            return b.second.compareTo(a.second);
        });
        HashMap<String,Integer> map=new HashMap<>();
        for(String x:words){
             map.put(x,map.getOrDefault(x,0)+1);
        }
         for(String key :map.keySet()){
            pq.add(new Pair(map.get(key),key));
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(0,pq.poll().second);
        }
return ans;
    }
}