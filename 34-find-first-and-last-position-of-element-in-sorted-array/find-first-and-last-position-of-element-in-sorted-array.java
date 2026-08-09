class Solution {

    public int[] searchRange(int[] a, int x) {
        int first = lowerbound(a, x);
        int last = upperbound(a, x);
        return new int[]{first, last};
    }

    private int lowerbound(int[] a, int x) {
        int n = a.length;
        int res = -1;
        int low = 0;
        int high = n - 1;

      while(low<=high){
        int guess=(high+low)/2;
        if(a[guess]<x){
            low=guess+1;
        }else if(a[guess]>x){
            high=guess-1;
        }else{
            res=guess;
            high=guess-1;
        }
      }
      return res;
    }
     private int upperbound(int[] a, int x) {
        int n = a.length;
        int res = -1;
        int low = 0;
        int high = n - 1;

      while(low<=high){
        int guess=(high+low)/2;
        if(a[guess]>x){
            high=guess-1;
        }else if(a[guess]<x){
            low=guess+1;
        }else{
            res=guess;
            low=guess+1;
        }
      }
      return res;
    }
}
    