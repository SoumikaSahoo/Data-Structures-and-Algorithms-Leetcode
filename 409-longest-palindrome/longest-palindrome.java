class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int result=0;
        boolean oddfound=false;
        for(int val:map.values()){
          if(val%2==0) {
            result=result +val;
        }else{
            result=result +val-1;
            oddfound=true;
        }
        }

if(oddfound){
    result=result+1;
}
return result;
    }
}