class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];
        int res=-1;
        while(low<=high){
            int guess=low+(high-low)/2;
            int ans=fun(matrix,m,n,guess);
            if
                (ans<k){ low=guess+1;
            }
            else{
                res=guess;
                high=guess-1;
            }
        }
        return res;
    }
    public int fun(int[][]matrix,int m,int n,int guess){
        int row=n-1;
        int column=0;
        int count=0;
        while(row>=0 && column<n){
            if(matrix[row][column]<=guess){
                count=count+row+1;
                column++;

            }else{
                row--;
            }
        }
        return count;
    }
}