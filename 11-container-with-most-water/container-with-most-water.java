class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
       int max_water=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            max_water=Math.max(max_water,h*w);
            if (height[l]<height[r]){
            l=l+1;
            }else{
                r=r-1;
            }
        }
        return max_water;
    }
}