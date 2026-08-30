class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int n=0;n<numRows;n++){
            List<Integer>row=new ArrayList<>();
            long ncr=1;
            for(int r=0;r<=n;r++){
                row.add((int)ncr);
                ncr=ncr*(n-r)/(r+1);
            }
            result.add(row);
        }
        return result;
        
    }
}