class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        int c=0;
        for(int i =start;c<n;i=i+2){
            xor=xor^i;
            c++;
        }
        return xor;
    }
}