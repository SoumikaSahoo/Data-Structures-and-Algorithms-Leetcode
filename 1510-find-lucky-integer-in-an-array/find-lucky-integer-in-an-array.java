class Solution {
    public int findLucky(int[] num) {
       
        int ans=-1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:num){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(key==value){
                ans=Math.max(key,ans);
            }
        }
return ans;
    }
}