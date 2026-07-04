
class Solution {
    List<Integer>inorder=new ArrayList<>();
    void inorder(TreeNode root) {
        if(root==null) return ;
    inorder(root.left);

    inorder.add(root.val);

    inorder(root.right);
}
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        inorder(root);
        for(int i=1;i<inorder.size();i++){
            if(inorder.get(i)<=inorder.get(i-1)) return false;
            
        }
        return true;
        
    }
    
}