class Solution {
    public int[][] construct2DArray(int[] arr, int r, int c) {
         if(arr.length!=r*c){
            return new int[0][0];
        }
        int[][]ans=new int[r][c];
        int x=0;
        int y=0;
        for(int i=0;i<arr.length;i++){
           
                ans[x][y]=arr[i];
                y++;
                if(y==c){
                    y=0;
                    x++;
                }


            
        }
        return ans;
    
    }
}