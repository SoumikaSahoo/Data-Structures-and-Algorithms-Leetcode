
class Solution {
     boolean ans=true;
    public boolean isBalanced(TreeNode root) {
        check (root);
        return ans;

    }
public int check(TreeNode root){
    if(root==null)return 0;
    int left=check(root.left);
    int right=check(root.right); 
    if(Math.abs(left-right)>1){
        ans=false;
        return 0;
    }
    return 1+Math.max(left,right);


}
}