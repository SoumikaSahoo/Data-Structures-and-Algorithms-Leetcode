
class Solution {
   TreeNode ans =null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root==null)return null;
    if(root==p||root==q){
        ans=root;
        return ans;
    }
    if(root.val<p.val && root.val<q.val){
        lowestCommonAncestor(root.right, p, q);
    }
    else if(root.val>p.val && root.val>q.val){
        lowestCommonAncestor(root.left, p, q);
    }else{
       ans=root;
    }
    return ans;
  
    }
}