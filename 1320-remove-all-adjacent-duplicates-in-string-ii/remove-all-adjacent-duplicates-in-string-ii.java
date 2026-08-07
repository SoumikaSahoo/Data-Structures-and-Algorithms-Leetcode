class Solution {
    public String removeDuplicates(String s, int k) {
         Stack<int[]> stack = new Stack<>();
          int n=s.length();
           for(char ch:s.toCharArray()){
        if(stack.isEmpty()){
             stack.push(new int[]{ch,1});
             continue;

        }
        if(stack.peek()[0]==ch){
            stack.peek()[1]++;
            if(stack.peek()[1]==k){
                stack.pop();
            }

        }else{
            stack.push(new int[]{ch,1});
        }
           }

StringBuilder sb=new StringBuilder();
while(!stack.isEmpty()){
    int [] top=stack.pop();
    for(int i=0;i<top[1];i++){
        sb.append((char) top[0]);
    }
}
return sb.reverse().toString();
    }
}