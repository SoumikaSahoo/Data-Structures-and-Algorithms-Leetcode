class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int n=s.length();
        int m=t.length();

   int []need=new int[256];
   int []have=new int[256];

   for(int i=0;i<m;i++){
    need[t.charAt(i)]++;
   }
   int low=0;
 
   int minlen=Integer.MAX_VALUE;
   int start=0;
  
   for(int high=0;high<n;high++){
    have[s.charAt(high)]++;
    while(sahi(have,need)){
         int len=high-low+1;
        if(len<minlen){
            minlen=len;
            start=low;
        }
         have[s.charAt(low)]--;
                low++;
            

    }
   }
   if(minlen==Integer.MAX_VALUE){
    return "";
   }
   return s.substring(start,start+minlen);
    }
   public boolean sahi(int[]have,int[]need){
    for(int i=0;i<256;i++){
        if(have[i]<need[i]){
            return false;
        }
    
   }
   return true ;
    }
}