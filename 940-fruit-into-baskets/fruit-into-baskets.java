class Solution {
    public int totalFruit(int[] nums) {
         int n=nums.length;
    int ans=-1;
    int low=0;
  
  
     HashMap<Integer,Integer> map=new HashMap<>();
    for(int high=0;high<n;high++){
     int fruit=nums[high];
     map.put(fruit,map.getOrDefault(fruit,0)+1);
    
    while(map.size()>2){
    int leftfruit=nums[low];
       map.put(leftfruit,map.get(leftfruit)-1);
       if(map.get(leftfruit)==0){
           map.remove(leftfruit);
       }
       low++;
        
    }
    
    
    if(map.size()==2 ||map.size()<2){
        int len=high-low+1;
        ans=Math.max(ans,len);
    }
    }
          return ans;
    }
    }
        
    