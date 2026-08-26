class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int n=s.length();
        List<List<Integer>>ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(j<n){
            while(j+1<n &&s.charAt(j)==s.charAt(j+1)){
                j++;
            }
            if(j-i+1>=3){
                ans.add (Arrays.asList(i,j));

            }
            j++;
            i=j;
        }
        return ans;
    }
}