
class Solution {
    public boolean hasPath(TreeNode root, int sum,int targetSum) {
        boolean res=false;
     if (root==null)return false;
     sum=sum+root.val;
     if(root.left==null && root.right==null){
        if(sum==targetSum){
            res=true;
            return res;
        }
        return false;
     }
       return hasPath(root.left,sum,targetSum)||
        hasPath(root.right,sum,targetSum);
        

     }
    public boolean hasPathSum(TreeNode root,int targetSum){
    return hasPath(root,0,targetSum);

    
}
}