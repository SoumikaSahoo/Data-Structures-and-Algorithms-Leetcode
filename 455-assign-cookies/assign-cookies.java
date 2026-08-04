class Solution {
    public int findContentChildren(int[] child, int[] cookie) {
        Arrays.sort(child);
        Arrays.sort(cookie);
        int i=0;
        int j=0;
        int res=0;
        while(i<child.length && j<cookie.length){
            if(cookie[j]>=child[i]){
res++;
i++;
j++;
            }else{
                j++;
            }
        }
        return res;
    }
}