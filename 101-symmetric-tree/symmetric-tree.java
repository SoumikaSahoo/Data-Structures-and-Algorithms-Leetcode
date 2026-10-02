
class Solution {
   
        public boolean func(TreeNode root1,TreeNode root2){
            if(root1==null && root2==null)return true;
            if(root1==null || root2==null)return false;
            if(root1.val!=root2.val)return false;
            boolean r1=func(root1.left,root2.right);
            boolean r2=func(root1.right,root2.left);
            if(r1&&r2)return true;
            return false;
       
     }
      public boolean isSymmetric(TreeNode root) {
        return func(root.left,root.right);
     }
}