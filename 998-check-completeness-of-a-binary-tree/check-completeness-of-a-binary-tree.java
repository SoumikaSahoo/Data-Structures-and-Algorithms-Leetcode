
class Solution {
boolean nullfound=false;
    public boolean isCompleteTree(TreeNode root) {
     if(root==null) return true;
     Queue<TreeNode>q=new LinkedList<>();
     q.offer(root);
     while(!q.isEmpty()){
        TreeNode t=q.peek();
        q.poll();
        if(t==null){
            nullfound=true;
        }else{
            if(nullfound==true){
                return false;
            }
        
        q.offer(t.left);
        q.offer(t.right);

     }
     }

      return true;  
    }
}