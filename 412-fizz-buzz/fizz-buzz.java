class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans =new ArrayList<>();
  for(int i=1;i<=n;i++){
        StringBuilder s=new StringBuilder();
      
            if(i%3==0 && i%5==0){
                s.append("FizzBuzz");
            }else if(i%3==0){
                s.append("Fizz");
            }else if(i%5==0){
                s.append("Buzz");
            }
            else {
                s.append(i);
            }
        
       
       ans.add(s.toString());
  }
       return ans;

    }
}