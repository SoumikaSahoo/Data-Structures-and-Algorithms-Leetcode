
class Solution {
    public int hasPath(TreeNode root, int sum) {
    int res=0;
     if (root==null)return 0;
     sum=sum*10 + root.val;
     if(root.left==null && root.right==null){
       res=res+sum;
       return res;
        
     }
       return hasPath(root.left,sum)+
        hasPath(root.right,sum);
        

        
}
public int sumNumbers(TreeNode root){
    return hasPath(root,0);
}
}
  