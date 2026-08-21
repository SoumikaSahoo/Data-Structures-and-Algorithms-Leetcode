class Solution {
    public boolean isPerfectSquare(int num) {

        if(num<0)return false;
        if(num==0 || num==1)return true;
        int left= 1;
        int right=num;
        
        while(left<=right){
            int mid=(left+right)/2;
            long square =(long)mid*mid;
            if(mid*mid==num){
                return true;
            }else if(square<num){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;

    }
}