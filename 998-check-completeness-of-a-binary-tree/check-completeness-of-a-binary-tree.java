
class Solution {
boolean nullfound=false;
    public boolean isCompleteTree(TreeNode root) {
     if(root==null) return true;
     Queue<TreeNode>q=new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
        TreeNode t=q.poll();
       
        if(t==null){
            nullfound=true;
        }else{
            if(nullfound==true){
                return false;
            }
        
        q.add(t.left);
        q.add(t.right);

     }
     }

      return true;  
    }
}