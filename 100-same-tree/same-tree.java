
class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
      
       if(root1==null&&root2==null)return true;
        if(root1==null||root2==null)return false;
        if(root1.val!=root2.val)return false;
        boolean r1=isSameTree(root1.left,root2.left);
        boolean r2=isSameTree(root1.right,root2.right);
       
        if(r1&&r2) return true;
        return false;
    }
}