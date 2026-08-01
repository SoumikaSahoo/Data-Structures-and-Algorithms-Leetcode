class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
           List<int[]> ans = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < a.length && j < b.length){
            int s1 = a[i][0];
            int e1 = a[i][1];
            int s2 = b[j][0];
            int e2 = b[j][1];
  if(e1 >= s2 && e2 >= s1){
                int s = Math.max(s1, s2);
                int e = Math.min(e1, e2);
                ans.add(new int[]{s, e});
            }
  if(e1 <= e2){
                i++;
            } else {
                j++;
            }
        }

        return ans.toArray(new int[ans.size()][]);


    }
}