class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
      int n=s.length();
      int low =0;
      int ans=0;
      for(int high=0;high<n;high++){
        char ch=s.charAt(high);
        map.put(ch,map.getOrDefault(ch,0)+1);
      
int k=high-low+1;
while(map.size()<k){
     char leftchar =s.charAt(low);
       map.put(leftchar,map.get(leftchar)-1);
       if(map.get(leftchar)==0){
           map.remove(leftchar);
       }
       low++;
    k=high-low+1;
   
}
ans=Math.max(ans,high-low+1);
}
return ans ;
}
}