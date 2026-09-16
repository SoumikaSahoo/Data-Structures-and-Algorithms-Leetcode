class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> Integer.compare(a[0]-a[1], b[0]-b[1]));
int totalcost=0;
int n=costs.length/2;
for(int i=0;i<costs.length;i++){
    if(i<n){
        totalcost=totalcost+costs[i][0];

    }else{
        totalcost=totalcost+costs[i][1];
    }
}

return totalcost;
    }
}